import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Print {
	public static void main(String[] args) throws InterruptedException {
		JFrame f1=new JFrame("Frame 1");
		JFrame f2=new JFrame("Frame 2");	
		JFrame f3=new JFrame("Frame 3");	
		JFrame f4=new JFrame("Frame 4");		
		JFrame f5=new JFrame("Frame 5");		
		f1.setVisible(true);
		f1.setLayout(null);
		f2.setVisible(true);
		f2.setLayout(null);
		f3.setVisible(true);
		f3.setLayout(null);
		f4.setVisible(true);
		f4.setLayout(null);
		f5.setVisible(true);
		f5.setLayout(null);
		f1.setBounds(100, 200, 300, 500);
		f2.setBounds(400, 200, 300, 500);
		f3.setBounds(700, 200, 300, 500);
		f4.setBounds(1000, 200, 300, 500);
		f5.setBounds(1300, 200, 300, 500);
		TextArea a1=new TextArea(20,20);
		TextArea a2=new TextArea(20,20);
		TextArea a3=new TextArea(20,20);
		TextArea a4=new TextArea(20,20);
		TextArea a5=new TextArea(20,20);
		a1.setBounds(50, 50, 100, 400);
		a2.setBounds(50, 50, 100, 400);
		a3.setBounds(50, 50, 100, 400);
		a4.setBounds(50, 50, 100, 400);
		a5.setBounds(50, 50, 100, 400);
		f1.add(a1);
		f2.add(a2);
		f3.add(a3);
		f4.add(a4);
		f5.add(a5);
		Display d1=new Display(a1);
		Display d2=new Display(a2);
		Display d3=new Display(a3);
		Display d4=new Display(a4);
		Display d5=new Display(a5);
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		d5.start();		
		}
}
class Display extends Thread
{
	TextArea t;
	Display(TextArea t)
	{
		this.t=t;
	}
	public void run()
	{
		String txt="abcdef\n";
		for(int i=0;i<20;i++)
		{
		t.setText(txt);
		txt=txt+"abcdef\n";
		}
	}
}