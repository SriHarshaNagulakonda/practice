import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class attendance extends JFrame implements ItemListener, ActionListener
{
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsMeta;
	String query, dbURL, dbName, title;
	Container cp;

	String ref="",rollno="";
	String[] heads;
	int[] stChange;
	String[][] cubeData;
	int rows, cols, coo;

	
	public attendance(String tit, String dbnm, String qry){
		this.con  = null;
		this.stmt = null;
		this.rs = null;
		this.rsMeta=null;	

		this.dbName=dbnm;
		this.query=qry;
		this.title=tit;
		this.rows=0;
		this.cols=0;
		this.coo=0;

		dbURL ="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" +dbName;
		cp = getContentPane();

		try
		{ 
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			this.con=DriverManager.getConnection(this.dbURL);	
			this.con.setAutoCommit(false);
			this.stmt=this.con.createStatement();

			this.rs=this.stmt.executeQuery(query);		// execure query and get resultset (rs)
			rsMeta = rs.getMetaData();			// get rs metadata
			this.cols = rsMeta.getColumnCount();		// get number of colums
			this.coo =this.cols-1;
			while(rs.next()) { 				// get rows in resultset
			      ++this.rows; 
			   }

			heads = new String[cols];			// initialize col heads
			
			for (int i = 0; i < cols; i++) {  		// getting colums  heading in heads[]
     				int colindex=i+1;				// column indexes start from 1
				heads[i] = rsMeta.getColumnName(colindex);
				}



			stChange = new int[rows];			//to save value when status changed


			this.rs=this.stmt.executeQuery(query);		// execure query and get resultset (rs)
			cubeData = new String[rows][cols];			// initialize table data
	
			int j=0; int k=0;				// function to get resultset data
			while(rs.next())
			{
				if(j<=rows)
				{	int h=1;
					if(k<=cols)
					{
						for(int cc=0; cc<cols; cc++)
						{	cubeData[j][k]=rs.getString(h);
							h++; 
							k++;
						}
					}
					k=0;h=0;
					j++;
				}
			}


		
		}catch(Exception ex)
		 { System.err.println(ex.getMessage());
		   ex.printStackTrace(System.err);
		 }

	
	cp.setLayout(new GridLayout(rows+2,cols)); // 1 additional Row of Col heading, 1 for save btn

	//---------------- Adding heading in CP---------------------------------------

	for (int i = 0; i < cols; i++) {
		JLabel jl = new JLabel(" [ "+heads[i]+" ] ");
		jl.setOpaque(true);
		jl.setBackground(Color.gray);
		jl.setForeground(Color.white);
		cp.add(jl);
		
	}

	//---------------- Adding data ---------------------------------------


	for(int j=0; j<rows; j++){
		for(int k=0; k<cols; k++)
			{
			 if(k==(cols-1))
				{	 ref="-"+j+"."+k;
					String status=cubeData[j][k]+ref;
					stChange[j]=Integer.parseInt(rollno); // save previously selected status of each 									 		   // row(student) + array address
					Choice jc = new Choice();

						jc.add("Present"+ref);
						jc.add("Leave"+ref);
						jc.add("Absent"+ref);

						jc.select(status);

      						jc.addItemListener(this); 
						cp.add(jc);

				}
			 else
			  cp.add(new JLabel(cubeData[j][k]));
			  rollno=cubeData[j][k];
			}
		}
	addSaveButton();
	//----------------------------------------------------------------------------
	setTitle(title);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setResizable(false);
 	setVisible(true);

	}

	//------------------------SAVE BUTTON-----------------------------------------

	public void addSaveButton(){
		JButton saveBtn = new JButton(" ::::  Save  :::: ");
		saveBtn.addActionListener(this);
		cp.add(saveBtn);
	}


	//------------------------Item Listener -----------------------------------------
  public void itemStateChanged(ItemEvent ie) {
	String s = (String)ie.getItem();
	
	String ro = s.substring(s.indexOf("-")+1,s.indexOf("."));
	String co = s.substring(s.indexOf(".")+1,s.length());

	String stats = s.substring(0,s.indexOf("-"));

	int roo = Integer.parseInt(ro);
	coo = Integer.parseInt(co);
	
	cubeData[roo][coo]=stats;
  }

	//------------------------Action Listener-----------------------------------------
  public void actionPerformed(ActionEvent ae) {
       
	try{
		for(int j=0; j<rows; j++)
		{
			String updt = "update students set Status= '"+cubeData[j][coo]+"' where Rollno="+stChange[j];
			this.con=DriverManager.getConnection(this.dbURL);
			this.stmt.executeUpdate(updt);
		}
			this.con.commit();
			System.out.println("Records updated..!");
			con.close();

	}catch(Exception ex)
	 { System.err.println(ex.getMessage());
	   ex.printStackTrace(System.err);
	 }
  }





public static void main(String args[])
	{
	 new attendance("..:: Attendance Form ::.. ", "mydb.mdb", "SELECT *  FROM students order by Rollno");
	}

}// ends class m