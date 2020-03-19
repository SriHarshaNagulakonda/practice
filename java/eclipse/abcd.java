import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
class abcd
{
	public static void main(String args[])
	{
		ques1 s=new ques1();
		s.question1();
	}
}
class ques1 {
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