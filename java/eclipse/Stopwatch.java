import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Stopwatch {
	static Label time;
	 static int p=0,flag=0;
	static Clock neww,clock;
	 public static void main(String[] args) {
		 clock=new Clock();
		JFrame f=new JFrame("Stop Watch");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(0, 0, 1000, 700);
		Button start=new Button("Start");
		Button reset=new Button("Reset");
		Button stop=new Button("Stop");
		Font font=new Font("Times New Roman",Font.BOLD,30);
		start.setFont(font);
		reset.setFont(font);
		stop.setFont(font);
		start.setForeground(Color.BLUE);
		reset.setForeground(Color.BLUE);
		stop.setForeground(Color.BLUE);
		start.setBounds(500, 100, 200,100);
		reset.setBounds(500, 300, 200, 100);
		stop.setBounds(500, 500, 200, 100);
		time=new Label();
		time.setFont(font);
		time.setBounds(100, 100, 300, 400);
		time.setFont(new Font("Times New Roman",Font.BOLD,30));
		time.setForeground(Color.RED);
		neww=new Clock();
		f.add(start);f.add(reset);f.add(stop);f.add(time);
		start.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(p==1)
						{
							clock=neww;
							flag=0;
						}
						if(flag==0)
						{
							clock.start();
							flag=1;
						}
						if(flag==1) {
							clock.resume(); 
							flag++;
						}
				}
				});
		reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clock.stop();
				p=1;
				time.setText("00 : 00 : 00");
			}
		});
		stop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clock.suspend();
				flag=1;
			}
		});	}
}
class Clock extends Thread
{
	public void run()
	{	
		for(int i=0;i<60;i++)
		{
			for(int j=0;j<60;j++)
			{
				for(int k=0;k<100;k++)
				{
					Stopwatch.time.setText("0"+i+" : "+j+" : "+k);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {}
				}
			}
		}
	}
}