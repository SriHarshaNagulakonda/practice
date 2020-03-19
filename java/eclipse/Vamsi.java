import java.io.*;
import java.util.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.applet.*;
class Vamsi
{
public static void main(String args[])
{
	OpenPage op=new OpenPage();
	op.openPage();

}
}
class Login
{
void login()
{
	City c=new City();
	JFrame f1=new JFrame("Welcome to Login page");
	f1.setBounds(0,0,1980,1080);
	f1.setLayout(null);
	f1.setVisible(true);
	Font font=new Font("Consolas",2,40);
	TextField tf1=new TextField();
	f1.add(tf1);
	tf1.setFont(font);
	tf1.setBounds(250,250,250,45);
	Label l1=new Label("UserName");
	l1.setFont(font);
	l1.setBounds(50,250,250,45);
	f1.add(l1);
	TextField tf2=new TextField();
	f1.add(tf2);
	tf2.setBounds(250,350,200,45);
	tf2.setFont(font);
	Label l2=new Label("Password");
	l2.setFont(font);
	l2.setBounds(50,350,250,45);
	f1.add(l2);
	Button b1=new Button("Login");
	b1.setFont(font);
	b1.setBounds(175,450,200,65);
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String s1=tf1.getText();
			String s2=tf2.getText();
			int z=0;
			try
			{
			BufferedReader file=new BufferedReader(new FileReader("C:/JAVAPROJECT/projectfile.txt"));
			String x=file.readLine();
			while(!x.equals(null))
			{
				if(x.equals(s1+" "+s2))
				{
					z=1;
			        	c.city();
					break;
				}
				else
					x=file.readLine();
			}
			file.close();
			}
 			catch(Exception e1){}
			if(z==0)
			{
			Label l25=new Label("invalid password");
			l25.setBounds(500,350,300,50);
			l25.setFont(font);
			f1.add(l25);
			}
		}
	});
	f1.add(b1);
}
}
class Signup
{
void signUp()
{
	City c=new City();
	JFrame f2=new JFrame("Welcome to Signup page");
	f2.setBounds(0,0,1980,1080);
	f2.setLayout(null);
	f2.setVisible(true);
	Font font=new Font("Consolas",2,40);
	TextField tf1=new TextField();
	f2.add(tf1);
	tf1.setBounds(250,250,250,45);
	tf1.setFont(font);
	Label l1=new Label("Name");
	l1.setBounds(50,250,250,45);
	l1.setFont(font);
	f2.add(l1);
	TextField tf2=new TextField();
	f2.add(tf2);
	tf2.setBounds(250,350,250,45);
	tf2.setFont(font);
	Label l2=new Label("Email");
	l2.setBounds(50,350,250,45);
	l2.setFont(font);
	f2.add(l2);
	TextField tf3=new TextField();
	f2.add(tf3);
	tf3.setBounds(250,450,250,45);
	tf3.setFont(font);
	Label l3=new Label("Password");
	l3.setBounds(50,450,250,45);
	l3.setFont(font);
	f2.add(l3);
	String st=tf3.getText();
       	if(st.length()<8)
	{
	Font font1=new Font("Consolas",2,15);
	Label L=new Label("min 8 characters required");
	L.setBounds(250,500,500,10);
	L.setFont(font1);
	f2.add(L);
	}
	TextField tf4=new TextField();
	f2.add(tf4);
	tf4.setBounds(250,550,250,45);
	tf4.setFont(font);
	Label l4=new Label("Confirmation");
	l4.setBounds(15,550,350,45);
	l4.setFont(font);
	f2.add(l4);
	Button b1=new Button("Signup");
	b1.setBounds(175,700,200,45);
	b1.setFont(font);
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String s2=tf1.getText();
			String s3=tf2.getText();
			String s4=tf3.getText();
			int z=0;
			try{
			BufferedReader br2=new BufferedReader(new FileReader("C:/JAVAPROJECT/gmailfile.txt"));
			String y=br2.readLine();
					while(!y.equals(null))
			{
				if(y.equals(s3))
				{
			z=1;
 			BufferedWriter br=new BufferedWriter(new FileWriter("C:/JAVAPROJECT/projectfile.txt",true));
			br.write(s2+" "+s4);
			br.newLine();
			br.close();
			c.city();
			}
				
			else
				y=br2.readLine();
			}
			br2.close();
			}catch(Exception ee){}
			if(z==0)
			{
			Label l20=new Label("invalid email");
			l20.setBounds(600,350,300,50);
			l20.setFont(font);
			f2.add(l20);
			}	
			
		}
	});
	f2.add(b1);
	Button b2=new Button("Signup with Facebook");
	b2.setBounds(300,700,600,45);
	b2.setFont(font);
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			c.city();
		}
	});
	f2.add(b2);
}
}
class OpenPage 
{
void openPage()
{
	Login log=new Login();
	Signup sig=new Signup();
	JFrame f3=new JFrame("Buy Movie Tickets here!!!");
	f3.setBounds(0,0,1980,1080);
	f3.setLayout(null);
	f3.setVisible(true);
	Font font=new Font("Consolas",2,40);
	Button b1=new Button("Login");
	b1.setBounds(175,200,200,45);
	b1.setFont(font);
	//Font font=new Font("Consolas",2,40);
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			log.login();
		}
	});
	f3.add(b1);
	Button b2=new Button("Create Account");
	b2.setBounds(850,200,500,45);
	b2.setFont(font);
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			sig.signUp();
		}
	});
	f3.add(b2);
	
}
}
class City
{
void city()
{
	JFrame f4=new JFrame("Movies now!!");
	f4.setBounds(0,0,1980,1080);
	f4.setLayout(null);
	f4.setVisible(true);
	Font font=new Font("Consolas",2,40);
	Label l10=new Label("city");
	l10.setBounds(100,100,100,50);
	f4.add(l10);
	l10.setFont(font);
	TextField t10=new TextField();
	t10.setBounds(250,100,300,50);
	t10.setFont(font);
	Button b10=new Button("enter");
	b10.setBounds(175,250,100,50);
	b10.setFont(font);
	f4.add(t10);
	f4.add(b10);
	Theatre the=new Theatre();
	b10.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String s1=t10.getText();
			try
			{ 
			BufferedReader file=new BufferedReader(new FileReader("C:/JAVAPROJECT/cityfile.txt"));
			String x=file.readLine();
			while(!x.equals(null))
			{
				if(x.equals(s1))
				{
			        	the.theatre();
					break;
				}
				else
					x=file.readLine();
			}
			file.close();
			}
 		catch(Exception e1){}
		}
	});

}
}
class Theatre
{
void theatre()
{                   
	JFrame f5=new JFrame("theatre names");
	f5.setBounds(0,0,1980,1980);
	f5.setVisible(true);
	Font font=new Font("Consolas",2,50);
	f5.setLayout(null);
	try{
	BufferedImage j=ImageIO.read(new File("C:/JAVAPROJECT/2.0.JPG"));
	JLabel i=new JLabel(new ImageIcon(j));
	i.setBounds(100,100,600,700);
	f5.add(i);
	}
	catch(IOException e){}
	Button b11=new Button("ok");
	b11.setBounds(1000,500,150,100);
	f5.add(b11);
	b11.setFont(font);
	Bookings book=new Bookings();
	b11.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			book.booking();
		}
	});
	Button b12=new Button("next");
	b12.setBounds(1000,700,150,100);
	f5.add(b12);
	b12.setFont(font);
	Theatre1 th1=new Theatre1();
	b12.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			th1.theatre1();
		}
	});
	
}
}
class Theatre1
{
void theatre1()
{
	JFrame f7=new JFrame("theatre2");
	f7.setBounds(0,0,1980,1980);
	f7.setVisible(true);
	Font font=new Font("Consolas",2,50);
	try{
	BufferedImage j=ImageIO.read(new File("C:/JAVAPROJECT/2.0.JPG"));
	JLabel i=new JLabel(new ImageIcon(j));
	i.setBounds(100,100,600,700);
	f7.add(i);
	}
	catch(IOException e){}
	Button b12=new Button("ok");
	b12.setBounds(1000,500,150,100);
	f7.add(b12);
	b12.setFont(font);
	Bookings book=new Bookings();
	b12.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			book.booking();
		}
	});
}
}
class Bookings
{
void booking()
{
	JFrame f6=new JFrame("BOOKINGS");
	f6.setBounds(0,0,1980,1980);
	f6.setVisible(true);
	Font font=new Font("Consolas",2,40);
	Label l12=new Label("Theatre:  ");
	l12.setBounds(150,200,250,50); 
	l12.setFont(font);
	f6.add(l12);
	TextField t12=new TextField();
	t12.setBounds(400,200,250,50);
	t12.setFont(font);
	f6.add(t12);
	Label l13=new Label("Timings:");
	l13.setBounds(150,500,150,50);
	l13.setFont(font);
	f6.add(l13);
	Choice c=new Choice();
	f6.add(c);
	c.setBounds(400,500,100,50);
	c.add("11.15am");
	c.add("02.30pm");
	c.add("06.15pm");
	c.add("09.30pm");
	Button b13=new Button("ok");
	b13.setBounds(400,800,100,50);
	b13.setFont(font);
	f6.add(b13);
	Available avl=new Available();
	b13.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String s1=t12.getText();
			try
			{
			BufferedReader file=new BufferedReader(new FileReader("C:/JAVAPROJECT/theatrefile.txt"));
			String x=file.readLine();
			while(!x.equals(null))
			{
				if(x.equals(s1))
				{
			        	avl.available();
					break;
				}
				else
					x=file.readLine();
			}
			file.close();
			}
 		catch(Exception e1){}
		}
	});		
}
}
class Available
{
void available()
{
 	JFrame f8=new JFrame("AVAIlABLE");
	f8. setBounds(0,0,1980,1980);
	f8.setVisible(true);
	Font font=new Font("Consolas",2,40);
	Label l15=new Label(" Total nukmber of tickets in theare are 400");
	l15.setBounds(50,50,1000,50);
	l15.setFont(font);
	//f8.add(l15);
	Label l16=new Label("Required number of tickets are:");
	l16.setBounds(50,150,800,50);
	l16.setFont(font);
	f8.add(l16);
	TextField t16=new TextField();
	t16.setBounds(600,250,100,50);
	t16.setFont(font);
	f8.add(t16);
	Button b25=new Button("buy");
	b25.setBounds(750,350,100,50);
	b25.setFont(font);
	f8.add(b25);
	Tqs tq=new Tqs();
	Sorry sr=new Sorry();
	int x=400;
	int n=Integer.parseInt(t16.getText());
	x=x-n;
	if(x>0)
	{
	b25.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
		tq.tqs();
		}
	});
	}
	else
	{
		b25.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			sr.sry();
			}
		});
	}	
}
}
class Tqs
{
void tqs()
{
	JFrame f9=new JFrame("tqs");
	f9.setBounds(0,0,1980,1980);
	f9.setLayout(null);
	f9.setVisible(true);
	Font font=new Font("Consolas",2,40);
	Label l26=new Label("tqs for Buying");
	l26.setBounds(100,100,500,50);
	l26.setFont(font);	 
	f9.add(l26);
}
}
class Sorry
{
void sry()
{
	JFrame f9=new JFrame("tqs");
	f9.setBounds(0,0,1980,1980);
	f9.setLayout(null);
	f9.setVisible(true);
	Font font=new Font("Consolas",2,40);	
	Label l26=new Label("no tickests are available");
	l26.setBounds(100,100,500,50);
	l26.setFont(font);
	f9.add(l26);
}
}
//	import java.io.*; import java.util.*; import java.awt.image.*; import java.awt.*; import java.awt.Dimension; import java.awt.event.*; import javax.swing.*; import javax.imageio.*; import java.applet.*; class Vamsi { public static void main(String args[]) { OpenPage op=new OpenPage(); op.openPage(); } } class Login { void login() { City c=new City(); JFrame f1=new JFrame("Welcome to Login page"); f1.setBounds(0,0,1980,1080); f1.setLayout(null); f1.setVisible(true); Font font=new Font("Consolas",2,40); TextField tf1=new TextField(); f1.add(tf1); tf1.setFont(font); tf1.setBounds(250,250,250,45); Label l1=new Label("UserName"); l1.setFont(font); l1.setBounds(50,250,250,45); f1.add(l1); TextField tf2=new TextField(); f1.add(tf2); tf2.setBounds(250,350,200,45); tf2.setFont(font); Label l2=new Label("Password"); l2.setFont(font); l2.setBounds(50,350,250,45); f1.add(l2); Button b1=new Button("Login"); b1.setFont(font); b1.setBounds(175,450,200,65); b1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { String s1=tf1.getText(); String s2=tf2.getText(); int z=0; try { BufferedReader file=new BufferedReader(new FileReader("C:/JAVAPROJECT/projectfile.txt")); String x=file.readLine(); while(!x.equals(null)) { if(x.equals(s1+" "+s2)) { z=1; c.city(); break; } else x=file.readLine(); } file.close(); } catch(Exception e1){} if(z==0) { Label l25=new Label("invalid password"); l25.setBounds(500,350,300,50); l25.setFont(font); f1.add(l25); } } }); f1.add(b1); } } class Signup { void signUp() { City c=new City(); JFrame f2=new JFrame("Welcome to Signup page"); f2.setBounds(0,0,1980,1080); f2.setLayout(null); f2.setVisible(true); Font font=new Font("Consolas",2,40); TextField tf1=new TextField(); f2.add(tf1); tf1.setBounds(250,250,250,45); tf1.setFont(font); Label l1=new Label("Name"); l1.setBounds(50,250,250,45); l1.setFont(font); f2.add(l1); TextField tf2=new TextField(); f2.add(tf2); tf2.setBounds(250,350,250,45); tf2.setFont(font); Label l2=new Label("Email"); l2.setBounds(50,350,250,45); l2.setFont(font); f2.add(l2); TextField tf3=new TextField(); f2.add(tf3); tf3.setBounds(250,450,250,45); tf3.setFont(font); Label l3=new Label("Password"); l3.setBounds(50,450,250,45); l3.setFont(font); f2.add(l3); String st=tf3.getText(); if(st.length()<8) { Font font1=new Font("Consolas",2,15); Label L=new Label("min 8 characters required"); L.setBounds(250,500,500,10); L.setFont(font1); f2.add(L); } TextField tf4=new TextField(); f2.add(tf4); tf4.setBounds(250,550,250,45); tf4.setFont(font); Label l4=new Label("Confirmation"); l4.setBounds(15,550,350,45); l4.setFont(font); f2.add(l4); Button b1=new Button("Signup"); b1.setBounds(175,700,200,45); b1.setFont(font); b1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { String s2=tf1.getText(); String s3=tf2.getText(); String s4=tf3.getText(); int z=0; try{ BufferedReader br2=new BufferedReader(new FileReader("C:/JAVAPROJECT/gmailfile.txt")); String y=br2.readLine(); while(!y.equals(null)) { if(y.equals(s3)) { z=1; BufferedWriter br=new BufferedWriter(new FileWriter("C:/JAVAPROJECT/projectfile.txt",true)); br.write(s2+" "+s4); br.newLine(); br.close(); c.city(); } else y=br2.readLine(); } br2.close(); }catch(Exception ee){} if(z==0) { Label l20=new Label("invalid email"); l20.setBounds(600,350,300,50); l20.setFont(font); f2.add(l20); }	} }); f2.add(b1); Button b2=new Button("Signup with Facebook"); b2.setBounds(300,700,600,45); b2.setFont(font); b2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { c.city(); } }); f2.add(b2); } } class OpenPage { void openPage() { Login log=new Login(); Signup sig=new Signup(); JFrame f3=new JFrame("Buy Movie Tickets here!!!"); f3.setBounds(0,0,1980,1080); f3.setLayout(null); f3.setVisible(true); Font font=new Font("Consolas",2,40); Button b1=new Button("Login"); b1.setBounds(175,200,200,45); b1.setFont(font); //Font font=new Font("Consolas",2,40); b1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { log.login(); } }); f3.add(b1); Button b2=new Button("Create Account"); b2.setBounds(850,200,500,45); b2.setFont(font); b2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { sig.signUp(); } }); f3.add(b2); } } class City { void city() { JFrame f4=new JFrame("Movies now!!"); f4.setBounds(0,0,1980,1080); f4.setLayout(null); f4.setVisible(true); Font font=new Font("Consolas",2,40); Label l10=new Label("city"); l10.setBounds(100,100,100,50); f4.add(l10); l10.setFont(font); TextField t10=new TextField(); t10.setBounds(250,100,300,50); t10.setFont(font); Button b10=new Button("enter"); b10.setBounds(175,250,100,50); b10.setFont(font); f4.add(t10); f4.add(b10); Theatre the=new Theatre(); b10.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { String s1=t10.getText(); try { BufferedReader file=new BufferedReader(new FileReader("C:/JAVAPROJECT/cityfile.txt")); String x=file.readLine(); while(!x.equals(null)) { if(x.equals(s1)) { the.theatre(); break; } else x=file.readLine(); } file.close(); } catch(Exception e1){} } }); } } class Theatre { void theatre() { JFrame f5=new JFrame("theatre names"); f5.setBounds(0,0,1980,1980); f5.setVisible(true); Font font=new Font("Consolas",2,50); f5.setLayout(null); try{ BufferedImage j=ImageIO.read(new File("C:/JAVAPROJECT/2.0.JPG")); JLabel i=new JLabel(new ImageIcon(j)); i.setBounds(100,100,600,700); f5.add(i); } catch(IOException e){} Button b11=new Button("ok"); b11.setBounds(1000,500,150,100); f5.add(b11); b11.setFont(font); Bookings book=new Bookings(); b11.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { book.booking(); } }); Button b12=new Button("next"); b12.setBounds(1000,700,150,100); f5.add(b12); b12.setFont(font); Theatre1 th1=new Theatre1(); b12.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { th1.theatre1(); } }); } } class Theatre1 { void theatre1() { JFrame f7=new JFrame("theatre2"); f7.setBounds(0,0,1980,1980); f7.setVisible(true); Font font=new Font("Consolas",2,50); try{ BufferedImage j=ImageIO.read(new File("C:/JAVAPROJECT/2.0.JPG")); JLabel i=new JLabel(new ImageIcon(j)); i.setBounds(100,100,600,700); f7.add(i); } catch(IOException e){} Button b12=new Button("ok"); b12.setBounds(1000,500,150,100); f7.add(b12); b12.setFont(font); Bookings book=new Bookings(); b12.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { book.booking(); } }); } } class Bookings { void booking() { JFrame f6=new JFrame("BOOKINGS"); f6.setBounds(0,0,1980,1980); f6.setVisible(true); Font font=new Font("Consolas",2,40); Label l12=new Label("Theatre: "); l12.setBounds(150,200,250,50); l12.setFont(font); f6.add(l12); TextField t12=new TextField(); t12.setBounds(400,200,250,50); t12.setFont(font); f6.add(t12); Label l13=new Label("Timings:"); l13.setBounds(150,500,150,50); l13.setFont(font); f6.add(l13); Choice c=new Choice(); f6.add(c); c.setBounds(400,500,100,50); c.add("11.15am"); c.add("02.30pm"); c.add("06.15pm"); c.add("09.30pm"); Button b13=new Button("ok"); b13.setBounds(400,800,100,50); b13.setFont(font); f6.add(b13); Available avl=new Available(); b13.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { String s1=t12.getText(); try { BufferedReader file=new BufferedReader(new FileReader("C:/JAVAPROJECT/theatrefile.txt")); String x=file.readLine(); while(!x.equals(null)) { if(x.equals(s1)) { avl.available(); break; } else x=file.readLine(); } file.close(); } catch(Exception e1){} } });	} } class Available { void available() { JFrame f8=new JFrame("AVAIlABLE"); f8. setBounds(0,0,1980,1980); f8.setVisible(true); Font font=new Font("Consolas",2,40); Label l15=new Label(" Total nukmber of tickets in theare are 400"); l15.setBounds(50,50,1000,50); l15.setFont(font); //f8.add(l15); Label l16=new Label("Required number of tickets are:"); l16.setBounds(50,150,800,50); l16.setFont(font); f8.add(l16); TextField t16=new TextField(); t16.setBounds(600,250,100,50); t16.setFont(font); f8.add(t16); Button b25=new Button("buy"); b25.setBounds(750,350,100,50); b25.setFont(font); f8.add(b25); Tqs tq=new Tqs(); Sorry sr=new Sorry(); int x=400; int n=Integer.parseInt(t16.getText()); x=x-n; if(x>0) { b25.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { tq.tqs(); } }); } else { b25.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { sr.sry(); } }); }	} } class Tqs { void tqs() { JFrame f9=new JFrame("tqs"); f9.setBounds(0,0,1980,1980); f9.setLayout(null); f9.setVisible(true); Font font=new Font("Consolas",2,40); Label l26=new Label("tqs for Buying"); l26.setBounds(100,100,500,50); l26.setFont(font);	f9.add(l26); } } class Sorry { void sry() { JFrame f9=new JFrame("tqs"); f9.setBounds(0,0,1980,1980); f9.setLayout(null); f9.setVisible(true); Font font=new Font("Consolas",2,40);	Label l26=new Label("no tickests are available"); l26.setBounds(100,100,500,50); l26.setFont(font); f9.add(l26); } } 