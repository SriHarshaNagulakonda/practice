import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class neww 
{  
  public static void main(String args[])  
  {  
    Login s=new Login();  
    s.login();
  }
}
class Login implements ActionListener{
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
          String username=t.getText();
          String password=t.getText();    	  
    	  s1.start();
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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
class SignUp{
	JFrame f;
	Label l;
	Label l1;
	Label l2;
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
    	    if(passtext.length()>=8&&passtext.equals(cpasstext)&&usernametext.length()>0)
    	    	s.login();
    		FileWriter f;
    		try {
    			f = new FileWriter("D:/Helloo.txt");
    			f.write(usernametext+passtext);		
    			f.close();
    		} 
    		catch (IOException a) {}  
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
	void question1()
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
		Label q1=new Label("1.What is the First Letter of The String 'JAVA MINI PROJECT'");
		q1.setFont(font);
		q1.setBounds(100, 250, 1000, 30);
		q.add(q1);
		ButtonGroup b=new ButtonGroup();
		JRadioButton j1=new JRadioButton("  1)  j");
		j1.setFont(font);
		j1.setBounds(200, 350,600,50);
		b.add(j1);
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
		next.setBounds(700, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question2();
	              }  
	        });
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
			next.setBounds(500, 1000, 100, 40);
		    next.addActionListener(new ActionListener()
		      {  
		        public void actionPerformed(ActionEvent e)  
		    	{ 	
		        	question3();
		              }  
		        });}
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question4();
	              }  
	        });
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
        JRadioButton j3=new JRadioButton("  3)  ");
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question5();
	              }  
	        });}
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question6();
	              }  
	        });
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question7();
	              }  
	        });
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question8();
	              }  
	        });
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question9();
	              }  
	        });
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
		next.setBounds(500, 700, 100, 40);
	    next.addActionListener(new ActionListener()
	      {  
	        public void actionPerformed(ActionEvent e)  
	    	{ 	
	        	question10();
	              }  
	        });
	}
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
        }
}