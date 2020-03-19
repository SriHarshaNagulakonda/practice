import java.awt.*;

//import java.awt.JMenuBar;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class a1 {
	public static void main(String[] args) {
	NotePad n=new NotePad();
	n.notePad();
	}
}
class NotePad{
	static JTextArea area;
	void notePad() {
		Delete d=new Delete();
		Open o=new Open();
		Save s=new Save();
		Copy c=new Copy();
		Paste p=new Paste();
		Find fi=new Find();
		Fontt fo=new Fontt();
		Colour co=new Colour();
		JFrame f=new JFrame("Note Pad");
		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(0, 0, 1980, 1980);
		JMenuBar mb=new JMenuBar();
		JMenu file=new JMenu("File");
		JMenuItem New=new JMenuItem("New");
		JMenuItem open=new JMenuItem("Open");
		JMenuItem save=new JMenuItem("Save");
		JMenuItem saveas=new JMenuItem("Save As");
		JMenuItem exit=new JMenuItem("Exit");
		file.add(New);
		file.add(open);
		file.add(save);
		file.add(saveas);		
		file.add(exit);
		JMenu edit=new JMenu("Edit");
		JMenuItem undo=new JMenuItem("Undo");
		JMenuItem cut=new JMenuItem("Cut");
		JMenuItem copy=new JMenuItem("Copy");
		JMenuItem paste=new JMenuItem("Paste");	
		JMenuItem delete=new JMenuItem("Delete");
		JMenuItem find=new JMenuItem("Find");
		edit.add(undo);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.add(find);
		JMenu format=new JMenu("Format");
		JMenuItem font=new JMenuItem("Font");
		JMenuItem color=new JMenuItem("Color");
		Panel a=new Panel();
		format.add(color);
		format.add(a);
		format.add(font);
		mb.add(file);
		mb.add(edit);
		mb.add(format);
		f.setJMenuBar(mb);
		 area=new JTextArea();
		area.setColumns(1000);
		area.setRows(400);
		area.setBounds(0, 0,1980,1000);
		f.add(area);
		open.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	o.open();
	    	}  
	        });
		font.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	fo.font();
	    	}  
	        });
		find.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
			        	String text=area.getText();
						fi.find(text);
					}
				});
	    exit.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	System.exit(0);
	    	}  
	        });
		color.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	co.color();
	    	}  
	        });	    save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	String text=area.getText();
	        	s.save(text);
	            }  
	        });
	    delete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		d.delete();
	    	}
	    });
		copy.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	c.copy();
	    	}  
	        });
		cut.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	c.cut();
	    	}  
	        });
		paste.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	p.paste();
	    	}  
	        });
	}
}
class Save
{
	void save(String text)
	{
		Font font=new Font("Times New Roman",20,30);
		JFrame s=new JFrame("Save");
		s.setVisible(true);
		s.setLayout(null);
		s.setBounds(200, 100, 500, 300);
		JLabel path=new JLabel("File Name");
		path.setFont(font);
		path.setBounds(80,50,100,50);
		s.add(path);
		TextField t=new TextField();
		t.setBounds(200, 70, 100, 20);
	    s.add(t);
	    JButton save=new JButton("Save");
	    save.setBounds(150, 150, 100, 30);
	    save.setFont(font);
	    s.add(save);
	    save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	String str=t.getText();
	        	try {
					FileWriter f=new FileWriter("d:/"+str+"txt");
					f.write(text);
					f.close();
					s.dispose();
	        	} catch (IOException e1) { 
	        		JLabel not=new JLabel("Invalid File Name");
	        		not.setBounds(130, 200, 200, 20);
	        		s.add(not);
	        	}
	    	}  
	        });    
	}
}
class Open
{
	void open()
	{
		Font font=new Font("Times New Roman",20,30);
		JFrame s=new JFrame("Open");
		s.setVisible(true);
		s.setLayout(null);
		s.setBounds(200, 100, 500, 300);
		Label path=new Label("Path");
		path.setFont(font);
		path.setBounds(80,50,100,50);
		s.add(path);
		TextField t=new TextField();
		t.setBounds(200, 70, 100, 20);
	    s.add(t);
	    JButton open=new JButton("Open");
	    open.setBounds(150, 150, 100, 30);
	    open.setFont(font);
	    s.add(open);
	    open.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	String str=t.getText();
	        	String msg,txt="";
	        	try {
					BufferedReader b=new BufferedReader(new FileReader("d:/"+str+".txt"));
					msg=b.readLine();
					while(msg!=null)
					{
						txt=txt+msg;
						msg=b.readLine();
					}
					b.close();
		NotePad.area.setText(txt);
		s.dispose();
	    } catch (IOException e1) {
	    	JLabel not=new JLabel("Invalid File Name");
    		not.setBounds(130, 200, 200, 20);
    		s.add(not);
	    }
	    	}  
	        });
	}
}
class Delete
{
	void delete()
	{
		String del=NotePad.area.getSelectedText();
		String full=NotePad.area.getText();
		int i=full.indexOf(del);
		String msg="";
		msg=full.substring(0, i);
		msg=msg + full.substring(i+del.length());
		NotePad.area.setText(msg);
	}
}
class Copy
{
	static String c;
	void copy()
	{
		 c=NotePad.area.getSelectedText();
	}
	void cut()
	{
		 c=NotePad.area.getSelectedText();		
		String full=NotePad.area.getText();
		int i=full.indexOf(c);
		String msg="";
		msg=full.substring(0, i);
		msg=msg + full.substring(i+c.length());
		NotePad.area.setText(msg);
	}
}
class Paste
{
	void paste()
	{
		int i=NotePad.area.getCaretPosition();
		String full=NotePad.area.getText();
		String msg=full.substring(0, i);
		msg = msg + Copy.c;
		msg = msg + full.substring(i);
		NotePad.area.setText(msg);
	}
}
class Find
{
	void find(String full)
	{
		JFrame f=new JFrame("Find");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(800, 200, 400, 200);
		JLabel findwhat=new JLabel("Find What :");
		findwhat.setBounds(10, 30, 80, 20);
		JTextField find=new JTextField();
		find.setBounds(100, 30, 100, 20);
		JButton findnext=new JButton("Find");
		findnext.setBounds(250, 30, 80, 30);
		findnext.addActionListener(new ActionListener()
				{
			String get;
			int i,j;
					public void actionPerformed(ActionEvent e)
					{
						if(j==0) {
						j=1;
						get=find.getText();
						 i=full.indexOf(get);
						NotePad.area.setSelectionStart(i);
						NotePad.area.setSelectionEnd(i+get.length());
						f.dispose();
						}
						else
						{
							i=full.indexOf(get,i+get.length());							
							NotePad.area.setSelectionStart(i);
							NotePad.area.setSelectionEnd(i+get.length());	
						}
					}
				});
		f.add(findwhat);
		f.add(find);
		f.add(findnext);
	}
}
class Fontt
{
	void font()
	{
		JFrame font=new JFrame("Font");
		font.setVisible(true);
		font.setLayout(null);
		font.setBounds(300, 300, 800, 600);
		JComboBox style=new JComboBox();
		style.setEditable(true);
		style.addItem("Cooper");
		style.addItem("Copperplate Gothic");
		style.addItem("Engravers MT");
		style.addItem("Forte");
		style.addItem("Gill Sans");
		style.addItem("Goudy Stout");
		style.addItem("Jokerman");
		style.addItem("Latin");
		style.addItem("Matura MT Script Capitals");
		style.addItem("Ravie");
		style.setBounds(100, 100, 150, 50);
		JComboBox type=new JComboBox();
		type.setBounds(300, 100, 150, 50);
		type.addItem("Plain");
		type.addItem("Bold");
		type.addItem("Italic");
		JComboBox size=new JComboBox();
		size.setBounds(500, 100, 150, 50);
		for(int i=20;i<=100;i=i+4)
		size.addItem(i+"");
		font.add(style);font.add(type);font.add(size);
		JButton ok=new JButton("OK");
		ok.setBounds(300,400,100,50);
		font.add(ok);
		ok.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String str=(String)style.getSelectedItem();
						int a=Integer.parseInt((String)size.getSelectedItem());
						System.out.println(a);
						NotePad.area.setFont(new Font(str,type.getSelectedIndex(),a));		
					}
				});
	}
}
class Colour
{
	void color()
	{
		JFrame j=new JFrame("Colors");
		j.setVisible(true);
		j.setLayout(null);
		j.setBounds(400, 400, 500, 500);
		Button red=new Button();
		red.setBackground(Color.RED);
		red.setBounds(100, 100, 50, 50);
		Button blue=new Button();
		blue.setBackground(Color.BLUE);
		blue.setBounds(200, 100, 50, 50);
		Button yellow=new Button();
		yellow.setBackground(Color.YELLOW);
		yellow.setBounds(300, 100, 50, 50);
		Button green=new Button();
		green.setBackground(Color.GREEN);
		green.setBounds(100, 200, 50, 50);
		Button orange=new Button();
		orange.setBackground(Color.ORANGE);
		orange.setBounds(200, 200, 50, 50);
		Button black=new Button();
		black.setBackground(Color.BLACK);
		black.setBounds(300, 200, 50, 50);
		red.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){NotePad.area.setForeground(Color.RED);}});
		blue.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){NotePad.area.setForeground(Color.BLUE);}});
		yellow.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){NotePad.area.setForeground(Color.YELLOW);}});
		green.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){NotePad.area.setForeground(Color.GREEN);}});
		orange.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){NotePad.area.setForeground(Color.ORANGE);}});
		black.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){NotePad.area.setForeground(Color.BLACK);}});
		j.add(red);j.add(blue);j.add(yellow);j.add(green);j.add(orange);j.add(black);
	}
}