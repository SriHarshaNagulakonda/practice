import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/*
public class table {

	public static void main(String[] args) {
		String column1[]= {"123","123"};
		String row1[][]=  {{"1254","124569"}};
		JTable t=new JTable(row1,column1);
		JFrame f=new JFrame();
		f.setBounds(0,0,1980,1080);
		f.setLayout(null);
		f.setVisible(true);
		f.add(t);
		t.setBounds(300,300,100,50);
	}

}
*/
public class table {    
    JFrame f;    
    table(){    
    f=new JFrame();    
    f.setBounds(0, 0, 1980, 1080);
    f.setLayout(null);
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(300,300,500,200);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);   
    sp.setBounds(300,300,500,200);
    f.setSize(300,400);
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new table();    
}    
}