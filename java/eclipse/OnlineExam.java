import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class OnlineExam
{  
  public static void main(String args[])  
  {  
    Login s=new Login();  
    s.login();
  }
}
class Login {
	 String username;//="Hello";
	 void login()
	 {
    Start s1=new Start();
    SignUp s=new SignUp();
    JFrame f=new JFrame("Online Exam");
    f.setVisible(true);
    f.setBounds(0,0,1980,1080);
    f.setLayout(null);
    Font myFont = new Font ("Courier New", 1, 20);
    Label l=new Label("Enter UserName");
    Label l1=new Label("Enter Password");
    l1.setFont(myFont);
    l.setFont(myFont);
    //l.setLocation(350, 300);
    l.setBounds(350,300,160,40);
    l1.setBounds(350, 400, 160, 40);
    TextField t=new TextField();
    TextField t1=new TextField();
    t.setBounds(550, 300, 200, 40);
    t1.setBounds(550, 400, 200, 40);
    Button b=new Button("LOGIN");		
    Button b1=new Button("Sign Up");
    b1.addActionListener(new ActionListener()
      {  
        public void actionPerformed(ActionEvent e)  
    	{ 	
        	s.signUp();
              }  
        });
    
    b.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e){  
         username=t.getText();
          String password=t1.getText();
          int y=0;
          try {
        	  String x;
			BufferedReader br=new BufferedReader(new FileReader("D:/signup.txt"));
			x=br.readLine();			
			while(!x.equals(null))
			{	
				if(x.equals(username+" "+password))
				{
					y=1;
					s1.start();
					break;
				}
				else
					x=br.readLine();
			}
			} catch (Exception e1) {}
          if(y==0)
          {
      Label notfound=new Label("Username or Password incorrect");
      notfound.setBounds(550,350,300,20);
      notfound.setForeground(Color.RED);
      f.add(notfound);}
      }  
      });
    b1.setFont(myFont);
    b.setFont(myFont);
    b1.setBounds(500, 500, 100, 50);
    Label l2=new Label("New User");
    l2.setBounds(525, 560, 70, 20);
    f.add(l2);
    f.add(b1);
    f.add(b);
    f.add(t);
    f.add(l1);
    f.add(t1);
    b.setBounds(650,500,100,50);
    f.add(b);
    f.add(l);
  }
}
class SignUp{
	JFrame f;
	Label l;
	Label l1;
	Label l2;
	 int y=0;
	void passlength()
	{
	
	l=new Label("Password must be minimum 8 Characters");
	l.setBounds(400,360,250,20);
	    l.setForeground(Color.RED);
	f.add(l);
	}
	void passmatch()
	{
	l1=new Label("Password's didnt Match");
	l1.setBounds(400,460,250,20);
	    l1.setForeground(Color.RED);
	f.add(l1);
	}
	void user()
	{
	l2=new Label("Username must be filled");
	l2.setBounds(400,260,250,20);
	l2.setForeground(Color.RED);
	f.add(l2);
	}
    void signUp()
    {
    f=new JFrame("SignUp");
    Login s=new Login();
    Font myFont = new Font ("Courier New", 1, 20);
    f.setVisible(true);
    f.setBounds(0, 0, 1980, 1080);
    f.setLayout(null);
    Label user=new Label("Enter Username");
    Label pass=new Label("Enter Password");
    Label cpass=new Label("Confirm Password");
    pass.setFont(myFont);
    cpass.setFont(myFont);
    user.setFont(myFont);
    user.setBounds(200, 200, 160, 50);
    pass.setBounds(200, 300, 160, 50);
    cpass.setBounds(200, 400, 180, 50);
    TextField username=new TextField();
    TextField password=new TextField();
    TextField cpassword=new TextField();
    username.setBounds(400, 200, 160, 50);
    password.setBounds(400, 300, 160, 50);
    cpassword.setBounds(400, 400, 160, 50);
    Button login=new Button("LOGIN");
    login.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e){  
    	  String usernametext=username.getText();
    	  String passtext=password.getText();
    	    String cpasstext=cpassword.getText();
    	    if(passtext.length()<8)
    	    	passlength();
    	    else if(passtext.length()>=8)
    	    	f.remove(l);
    	    if(!passtext.equals(cpasstext))
    	    {
        	passmatch();
    	    f.remove(l);
    	    }
    	    if(usernametext.length()==0)
    	    	user();
    	    else
    	    	f.remove(l2);
    	    if(passtext.length()>=8 &&passtext.equals(cpasstext)&&usernametext.length()>0)
    	    {	
    	    	BufferedWriter f;
			try {
				f = new BufferedWriter(new FileWriter("D:/signup.txt",true));
		    	f.write(usernametext+" "+passtext);
		    	f.newLine();
		    	f.close();
		    	} catch (IOException e1) {}
			s.login();
			}    	  
    	//catch (IOException a) {}s.login();}  
      }});
    login.setBounds(420, 500, 100, 50);
    login.setFont(myFont);
    f.add(username);
    f.add(user);
    f.add(pass);
    f.add(cpass);
    f.add(password);
    f.add(cpassword);
    f.add(login);
    }
}
class Start
{
  void start()
  {
    Login s1=new Login();
    Confirm s=new Confirm();
    JFrame next=new JFrame();
    next.setVisible(true);
    next.setBounds(200,200,1000,600 );
    next.setLayout(null);
    Font myFont = new Font ("Courier New", 1, 30);
    Label label=new Label("All the best for your Exam");
    label.setFont(myFont);
    label.setBounds(300, 200, 500, 50);
    Button start=new Button("Start");
    Button logout=new Button("Log Out");
    start.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        s.confirm();
       }  
      });
    logout.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        s1.login();
       }  
      });
    logout.setBounds(350, 300, 100, 50);
    start.setBounds(500, 300, 100, 50);
    next.add(logout);
    next.add(label);
    next.add(start);
  }
}
class Confirm
{
  void confirm()
  {
	Question q=new Question();
    Start s=new Start();
    JFrame conf=new JFrame("Confirmation");
    conf.setVisible(true);
    conf.setBounds(300,300,700,400);
    conf.setLayout(null);
    Font myFont = new Font ("Courier New", 1, 30);
    Label confirm=new Label("Are you sure about your \nconfimation to write the exam");
    confirm.setFont(myFont);
    confirm.setBounds(100, 100, 520, 100);
    Button yes=new Button("Yes");
    Button no=new Button("No");
    yes.setFont(myFont);
    no.setFont(myFont);
    yes.setBounds(200, 250, 70, 50);
    no.setBounds(350, 250, 70, 50);
    conf.add(confirm);
    conf.add(yes);
    conf.add(no);
    no.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e){  
        s.start();
        }  
      });
    yes.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e){  
    	  q.question1();
      }  
      });  
  }
}
class Question {
	int i1[]=new int[10];
	int i2[]=new int[10];
	int i3[]=new int[10];
	int i4[]=new int[10];
	int score=0;
	//String username;
	void question1()
	{
	//	 int i1=0,i2=0,i3=0,i4=0;
	    Font myFont = new Font ("Courier New", 1, 50);
	    JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
		Font font = new Font ("Courier New", 1, 30);
	Label q1=new Label("1.What is the First Letter of The String 'JAVA MINI PROJECT'");
	q1.setFont(font);
	q1.setBounds(100, 250, 1000, 30);
	q.add(q1);
	ButtonGroup b=new ButtonGroup();
	JRadioButton j1=new JRadioButton("  1)  j");
	j1.setFont(font);
	j1.setBounds(200, 350,600,50);
	b.add(j1);
	//j1.setSelected(true);
	q.add(j1);
	JRadioButton j2=new JRadioButton("  2)  J");
	j2.setFont(font);
	j2.setBounds(200, 450,300,50);
	b.add(j2);
	q.add(j2);
	JRadioButton j3=new JRadioButton("  3)  p");
	j3.setFont(font);
	j3.setBounds(200, 550,300,50);
	b.add(j3);
	q.add(j3);
	JRadioButton j4=new JRadioButton("  4)  H");
	j4.setFont(font);
	j4.setBounds(200, 650,300,50);
	b.add(j4);
	q.add(j4);	
	Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question2();
	              }  
	        });
		Button save=new Button("save");
		save.setBounds(900, 700, 90, 40);
		save.setFont(font);
		q.add(save);
		save.addActionListener(new ActionListener()
		      {  
		        public void actionPerformed(ActionEvent e)  
		    	{ 	
		        	if(j1.isSelected())i1[0]=1;else i1[0]=0; 	
		        	if(j2.isSelected())i2[0]=1;else i2[0]=0; 
		        	if(j3.isSelected())i3[0]=1;else i3[0]=0;
		        	if(j4.isSelected())i4[0]=1;else i4[0]=0;
		              }  
		        });
		if(i1[0]==1)j1.setSelected(true);if(i2[0]==1)j2.setSelected(true);
		if(i3[0]==1)j3.setSelected(true);if(i4[0]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.RED);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	//	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
	    }
	void question2()
	{
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
	Font font = new Font ("Courier New", 1, 30);
	Label q1=new Label("2. Which of the following is not a Programming Language?");
	q1.setFont(font);
	q1.setBounds(100, 250, 1000, 50);
	q.add(q1);
	ButtonGroup b=new ButtonGroup();
	JRadioButton j1=new JRadioButton("  1)  Java");
	j1.setFont(font);
	j1.setBounds(200, 350,600,50);
	b.add(j1);
	q.add(j1);
	JRadioButton j2=new JRadioButton("  2)  C");
	j2.setFont(font);
	j2.setBounds(200, 450,300,50);
	b.add(j2);
	q.add(j2);
	JRadioButton j3=new JRadioButton("  3)  Hindi");
	j3.setFont(font);
	j3.setBounds(200, 550,300,50);
	b.add(j3);
	q.add(j3);
	JRadioButton j4=new JRadioButton("  4)  Python");
	j4.setFont(font);
	j4.setBounds(200, 650,300,50);
	b.add(j4);
	q.add(j4);
	Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question3();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[1]=1;else i1[1]=0; 	
	        	if(j2.isSelected())i2[1]=1;else i2[1]=0;
	        	if(j3.isSelected())i3[1]=1;else i3[1]=0;
	        	if(j4.isSelected())i4[1]=1;else i4[1]=0;
	   //     	s[1]=b.getSelection();
	              }  
	        });
	if(i1[1]==1)j1.setSelected(true);if(i2[1]==1)j2.setSelected(true);
	if(i3[1]==1)j3.setSelected(true);if(i4[1]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.RED);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	//b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});    
	}
	void question3()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("3.What is the difference between Abstract class and interface");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)  nothing just words are different");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2)  jvm knows the answer");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3)  declaration of variables are by final");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
    	Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question4();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[2]=1;else i1[2]=0; 	
        	if(j2.isSelected())i2[2]=1;else i2[2]=0;
        	if(j3.isSelected())i3[2]=1;else i3[2]=0;
        	if(j4.isSelected())i4[2]=1;else i4[2]=0;
        	if(i4[3]==1)score++;else score--;
              }  
        });
	if(i1[2]==1)j1.setSelected(true);if(i2[2]==1)j2.setSelected(true);
	if(i3[2]==1)j3.setSelected(true);if(i4[2]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.RED);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	//b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
        }
        void question4()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("4.How will you call an applet");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)  by inviting it");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2) by importing");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3)  by Extending it");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  Both 1 and 2");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
    	Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question5();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[3]=1;else i1[3]=0; 	
        	if(j2.isSelected())i2[3]=1;else i2[3]=0;
        	if(j3.isSelected())i3[3]=1;else i3[3]=0;
        	if(j4.isSelected())i4[3]=1;else i4[3]=0;
        	if(i2[3]==1)score++;else score--;
              }  
        });
	if(i1[3]==1)j1.setSelected(true);if(i2[3]==1)j2.setSelected(true);
	if(i3[3]==1)j3.setSelected(true);if(i4[3]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.RED);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	//b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
	}
        void question5()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("5.What is the object oriented way to become wealthy");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)  Inheritance");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2)  Multithreading");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3)  encapsulation");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
    	Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question6();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[4]=1;else i1[4]=0; 	
        	if(j2.isSelected())i2[4]=1;else i2[4]=0;
        	if(j3.isSelected())i3[4]=1;else i3[4]=0;
        	if(j4.isSelected())i4[4]=1;else i4[4]=0;
        	if(i1[4]==1)score++;else score--;
              }  
        });
	if(i1[4]==1)j1.setSelected(true);if(i2[4]==1)j2.setSelected(true);
	if(i3[4]==1)j3.setSelected(true);if(i4[4]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.RED);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	//b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
        }
        void question6()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("6.Who invented java");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)  James Gosling");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2)  Charlies Babbage");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3) Guido Van Rossum");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
    	Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question7();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[5]=1;else i1[5]=0; 	
        	if(j2.isSelected())i2[5]=1;else i2[5]=0;
        	if(j3.isSelected())i3[5]=1;else i3[5]=0;
        	if(j4.isSelected())i4[5]=1;else i4[5]=0;
        	if(i1[5]==1)score++;else score--;
              }  
        });
	if(i1[5]==1)j1.setSelected(true);if(i2[5]==1)j2.setSelected(true);
	if(i3[5]==1)j3.setSelected(true);if(i4[5]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.RED);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	//b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
        }
        void question7()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("7.How to communicate between two threads  ");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)  non living things cant communicate");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2) using some functions");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3)  tying the threads");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
        Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question8();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[6]=1;else i1[6]=0; 	
        	if(j2.isSelected())i2[6]=1;else i2[6]=0;
        	if(j3.isSelected())i3[6]=1;else i3[6]=0;
        	if(j4.isSelected())i4[6]=1;else i4[6]=0;
        	if(i2[6]==1)score++;else score--;
              }  
        });
	if(i1[6]==1)j1.setSelected(true);if(i2[6]==1)j2.setSelected(true);
	if(i3[6]==1)j3.setSelected(true);if(i4[6]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.RED);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	//	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
        }
        void question8()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("8. Who is AWT  ");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)  awt");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2) Abstract Window Tool Kit");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3)  Applied Weather Technology");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
        Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question9();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[7]=1;else i1[7]=0; 	
        	if(j2.isSelected())i2[7]=1;else i2[7]=0;
        	if(j3.isSelected())i3[7]=1;else i3[7]=0;
        	if(j4.isSelected())i4[7]=1;else i4[7]=0;
        	if(i1[7]==1)score++;else score--;
              }  
        });
	if(i1[7]==1)j1.setSelected(true);if(i2[7]==1)j2.setSelected(true);
	if(i3[7]==1)j3.setSelected(true);if(i4[7]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.RED);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	//b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
        }
        void question9()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("9. why is java called object oriented programming  ");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1) James gosling named like that");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2) as its contains objects");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3)  it is a programming language based on orientation");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
        Button next=new Button("next");
	next.setFont(font);
	q.add(next);
	next.setBounds(1000, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question10();
	              }  
	        });
	    Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[8]=1;else i1[8]=0; 	
        	if(j2.isSelected())i2[8]=1;else i2[8]=0;
        	if(j3.isSelected())i3[8]=1;else i3[8]=0;
        	if(j4.isSelected())i4[8]=1;else i4[8]=0;
        	if(i2[8]==1)score++;else score--;
              }  
        });
	if(i1[8]==1)j1.setSelected(true);if(i2[8]==1)j2.setSelected(true);
	if(i3[8]==1)j3.setSelected(true);if(i4[8]==1)j4.setSelected(true);
	    Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.RED);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.BLUE);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);	
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	//b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
	}
        ButtonModel str;
        void question10()
        {
	    Font myFont = new Font ("Courier New", 1, 50);
	JFrame	q=new JFrame("Question");
	q.setVisible(true);
	q.setLayout(null);
	q.setBounds(0, 0, 1980, 1080);
	Label question1=new Label("QUESTIONS");
	question1.setFont(myFont);
	question1.setForeground(Color.BLUE);
	question1.setBounds(100, 100, 300, 50);
	q.add(question1);
           Font font = new Font ("Courier New", 1, 30);
        Label q1=new Label("10. what is an event  ");
        q1.setFont(font);
        q1.setBounds(100, 250, 1000, 30);
        q.add(q1);
        ButtonGroup b=new ButtonGroup();
        JRadioButton j1=new JRadioButton("  1)object that is created when something changes in GUI");
        j1.setFont(font);
        j1.setBounds(200, 350,1000,50);
        b.add(j1);
        q.add(j1);
        JRadioButton j2=new JRadioButton("  2) it is a celebration");
        j2.setFont(font);
        j2.setBounds(200, 450,1000,50);
        b.add(j2);
        q.add(j2);
        JRadioButton j3=new JRadioButton("  3) it is a word");
        j3.setFont(font);
        j3.setBounds(200, 550,1000,50);
        b.add(j3);
        q.add(j3);
        JRadioButton j4=new JRadioButton("  4)  none of these");
        j4.setFont(font);
        j4.setBounds(200, 650,1000,50);
        b.add(j4);
        q.add(j4);
   
        Button save=new Button("save");
	save.setBounds(900, 700, 90, 40);
	save.setFont(font);
	q.add(save);
	save.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	if(j1.isSelected())i1[9]=1;else i1[9]=0; 	
        	if(j2.isSelected())i2[9]=1;else i2[9]=0;
        	if(j3.isSelected())i3[9]=1;else i3[9]=0;
        	if(j4.isSelected())i4[9]=1;else i4[9]=0;
        	if(i2[9]==1) score++;else score--;
        	str=b.getSelection();
            //System.out.println(b.getSelection());
              }  
        });
	/*if(i1[9]==1)j1.setSelected(true);if(i2[9]==1)j2.setSelected(true);
	if(i3[9]==1)j3.setSelected(true);if(i4[9]==1)j4.setSelected(true);*/
	b.setSelected(str, true);
        Font font1 = new Font ("Courier New", 1, 20);
	    Button b1=new Button("1");Button b2=new Button("2");Button b3=new Button("3");
	    Button b4=new Button("4");Button b5=new Button("5");Button b6=new Button("6");
	Button b7=new Button("7");Button b8=new Button("8");Button b9=new Button("9");Button b10=new Button("10");
	b1.setForeground(Color.BLUE);b2.setForeground(Color.BLUE);b3.setForeground(Color.BLUE);
	b4.setForeground(Color.BLUE);b5.setForeground(Color.BLUE);b6.setForeground(Color.BLUE);
	b7.setForeground(Color.BLUE);b8.setForeground(Color.BLUE);b9.setForeground(Color.BLUE);
	b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);b4.setFont(font1);b5.setFont(font1);
	b6.setFont(font1);b7.setFont(font1);b8.setFont(font1);b9.setFont(font1);b10.setFont(font1);
	b1.setBounds(1300, 400, 40, 40);b2.setBounds(1350, 400, 40, 40);b3.setBounds(1400, 400, 40, 40);
	b4.setBounds(1450, 400, 40, 40);b5.setBounds(1500, 400, 40, 40);b6.setBounds(1300, 450, 40, 40);
	b7.setBounds(1350, 450, 40, 40);b8.setBounds(1400, 450, 40, 40);b9.setBounds(1450, 450, 40, 40);
	b10.setBounds(1500, 450, 40, 40);b10.setForeground(Color.RED);
	q.add(b1);q.add(b2);q.add(b3);q.add(b4);q.add(b5);q.add(b6);q.add(b7);q.add(b8);q.add(b9);q.add(b10);
	b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question1();}});
	b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question2();}});
	b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question3();}});
	b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question4();}});
	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question5();}});
	b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question6();}});
	b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question7();}});
	b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question8();}});
	b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question9();}});
	//b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){question10();}});
	Button submit=new Button("submit");
	submit.setBounds(1000, 700, 100, 50);
	q.add(submit);
	submit.setFont(font1);
	submit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					submit();
				}
			}
			);
        }
        void submit()
        {
        	score=0;
        	if(i2[0]==1)score++;
        	if(i3[1]==1)score++;
        	if(i4[2]==1)score++;
        	if(i2[3]==1)score++;
        	if(i1[4]==1)score++;
        	if(i1[5]==1)score++;
        	if(i2[6]==1)score++;
        	if(i1[7]==1)score++;
        	if(i2[8]==1)score++;
        	if(i2[9]==1)score++;
        	JFrame	q=new JFrame("Result");
        	q.setVisible(true);
        	q.setLayout(null);
        	q.setBounds(0, 0, 1980, 1080);
        	Font myFont = new Font ("Courier New", Font.BOLD, 50);
        	String str="Your Score is "+score+"/10";
        	Label res=new Label(str);
        	res.setBounds(300, 200, 500,50);
        	res.setFont(myFont);
        	q.add(res);
        	if(score>5)
        	{
        		//Login l=new Login();
        		str="Congratulations ";//+username;
        		Label wish=new Label(str);
        		wish.setBounds(500,400,1000,50);
        		q.add(wish);
        		wish.setFont(myFont);
        		wish.setForeground(Color.GREEN);
        	}
        	else
        	{
        		Login l=new Login();
        		str="Better Luck Next Time ";
        		Label wish=new Label(str);
        		wish.setBounds(500,400,1000,50);
        		q.add(wish);        		
        		wish.setFont(myFont);
        		wish.setForeground(Color.RED);
        	}
        }
    }