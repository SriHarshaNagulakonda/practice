import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class LoginPage {
	public static void main(String[] args) {
		JFrame f=new JFrame("");
		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(0,0,1000,700);
		f.getContentPane().setBackground(Color.YELLOW);
		Label username=new Label("Username : ");
		username.setBounds(100, 250, 150, 30);
		TextField user=new TextField();
		user.setBounds(300, 250, 150, 30);
		Label password=new Label("Password : ");
		password.setBounds(100, 350, 150, 30);
		JPasswordField pass=new JPasswordField();
		pass.setBounds(300, 350, 150, 30);
		Checkbox show=new Checkbox("Show Password",false);
		show.setBounds(480, 350, 120, 30);
		Button login=new Button("Login");
		login.setBounds(600, 250, 200, 100);
		login.setFont(new Font("",Font.BOLD,30));
		f.add(username);f.add(user);f.add(password);f.add(pass);f.add(login);f.add(show);
		login.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String s1=user.getText();
						String s2="";
					//	if(!show.getState())
						 s2=String.valueOf(pass.getPassword());
						Button ok = null;
						try {
							BufferedReader file=new BufferedReader(new FileReader("D:/login.txt"));
							String x=file.readLine();
							while(!x.equals(null))
							{
								if(x.equals(s1+" "+s2))
								{
									Panel p=new Panel();
									p.setBackground(Color.BLUE);
									p.setBounds(0, 0,1000,200);
									f.add(p);
									Label success=new Label(" Login Successfully");
									success.setFont(new Font("",Font.BOLD,30));			
									success.setForeground(Color.GREEN);
									success.setBounds(0, 80, 300, 50);
									 ok=new Button("Ok");
									ok.setBounds(850, 70, 50,50);
									p.add(success);p.add(ok);	
									break;
								}
								else
									x=file.readLine();
							}
							file.close();
						}
						catch (Exception e1) {}
						ok.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{
										System.exit(0);
									}
								});
					}
			});
	}
}