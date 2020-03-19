import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator {
   static TextField one,two,result;
	static Button plus,minus,mul,div;
	static JFrame f;
   public static void main(String args[])
		{
				Font font=new Font("Times New Roman",Font.BOLD,20);
				 f=new JFrame("Calculator");
				f.setVisible(true);
				f.setLayout(null);
				f.setBounds(100, 100, 700, 700);
				Label first=new Label("First Number");
				first.setBounds(50,100,150,50);
				first.setFont(font);
				Label second=new Label("Second Number");
				second.setBounds(50,200,160,50);
				second.setFont(font);		
				 one=new TextField();
				one.setBounds(250, 100, 150, 50);
				 two=new TextField();
				two.setBounds(250, 200, 150, 50);
				 plus=new Button("+");
				plus.setBounds(100, 300, 50, 50);
				 minus=new Button("-");
				minus.setBounds(200, 300, 50, 50);
				 mul=new Button("*");
				mul.setBounds(300, 300, 50, 50);
				 div=new Button("/");
				div.setBounds(400, 300, 50, 50);
				Label res=new Label("Result");
				res.setBounds(50, 400, 150, 50);
				res.setFont(font);
				 result=new TextField();
				result.setBounds(250, 400, 150, 50);
				   Perform p=new Perform();
				   plus.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						p.perform('+');
					}
				});
				minus.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						p.perform('-');
					}
				});
				mul.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						p.perform('*');
					}
				});
				div.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						p.perform('/');
					}
				});
				f.add(first);f.add(second);f.add(one);f.add(two);f.add(plus);f.add(minus);f.add(mul);f.add(div);f.add(res);f.add(result);
				}
}
class Perform
{
	 void perform(char a) {
		String s1=Calculator.one.getText();
		String s2=Calculator.two.getText();
		String s3="";
		int x,y,z=0;
		try {
		 x=Integer.parseInt(s1);
		 y=Integer.parseInt(s2);
			if(a=='+')	
				z=x+y;
			if(a=='-')
				z=x-y;
			if(a=='*')
				z=x*y;
			if(a=='/')
				z=x/y;
			s3=String.valueOf(z);
			Calculator.result.setText(s3);
		}
		catch(Exception b) {
			Label wrong=new Label("Wrong Input");
			wrong.setBounds(250,150,100,40);
			Calculator.result.setText("");
			wrong.setForeground(Color.RED);
			Calculator.f.add(wrong);
		}
}
}