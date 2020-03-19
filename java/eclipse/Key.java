import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.applet.*;
/*<applet code="Key" width=300 height=400>
</applet>*/
public class Key extends Applet
implements KeyListener
{
	
	String a[]= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}; 
	int X=20,Y=30,i;
	String msg[]=new String[10];
	int x[]=new int[10];
	String str="";
	public void init()
	{
		addKeyListener(this);
		this.setSize(new Dimension(1980,1080));
		requestFocus();
		setBackground(Color.green);
		setForeground(Color.blue);
	}
	public void keyPressed(KeyEvent k){showStatus("hello");}//repaint();}
	public void keyReleased(KeyEvent k){}
	public void keyTyped(KeyEvent k)
	{
		str+=k.getKeyChar();
		showStatus(str);
	}
	public void paint(Graphics g)
	{
		int j,k;
		for(j=0;j<5;j++)
		{
			Random rand=new Random();
			for(k=0;k<10;k++) {
				msg[k]=a[rand.nextInt(52)];
				x[k]=rand.nextInt(1800);
			//	str+=msg[k];
				//showStatus(str);
			}
			for(i=1000;i>-2000;i=i-30)
			{	
				g.setFont(new Font("",Font.BOLD,55));
				g.setColor(Color.RED);
				for(k=0;k<10;k++) 
					g.fillOval(x[k], i+k*200, 100, 100);
				g.setColor(Color.WHITE);
				for(k=0;k<10;k++) {
				g.drawString(msg[k],x[k]+35,i+70+k*200);
				}
				//Thread.sleep(200/(j+1));
				try{TimeUnit.MILLISECONDS.sleep(200/(j+1));} catch(Exception e) {}
				for(k=0;k<10;k++) 
				g.clearRect(x[k], i+k*200, 200, 200);
			}
		}
	}
}