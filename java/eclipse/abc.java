import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
public class abc 
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
  }
}