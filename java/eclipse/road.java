import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;
public class road extends Applet {
	public void init()
	{
		this.setSize(new Dimension(1980,1080));
	}
	public void paint(Graphics g)
	{
		setSize(1980,1080);
		g.fillRect(800,0,200,1000);
		g.fillRect(0, 500, 2000, 200);
		g.clearRect(10,520,810,10);
		g.clearRect(980,520,1000,10);
		g.clearRect(820,10,10,520);
		g.clearRect(970,10,10,520);
		g.clearRect(10,660,810,10);
		g.clearRect(980,660,1000,10);
		g.clearRect(970,660,10,520);
		g.clearRect(820,660,10,520);
		g.drawLine(500, 200, 500,400);
		g.drawArc(500, 140, 120, 120, 0, 180);
		g.drawLine(620, 200, 620, 400);
		g.drawArc(500, 340, 120, 120, 180, 180);
		g.drawOval(515, 155, 90, 90);
		g.drawOval(515, 255, 90, 90);
		g.drawOval(515, 355, 90, 90);
		g.drawLine(620, 290, 700, 290);
		g.drawLine(620, 310, 680, 310);
		g.drawLine(700,290,700,500);
		g.drawLine(680, 310, 680, 500);
		int i;
		for( i=620;i<=680;i=i+40)
		{
			g.setColor(Color.BLACK);
			g.fillRect( i,290,20,20 );
		}
		for( i=640;i<=680;i=i+40)
		{
			g.setColor(Color.YELLOW);
			g.fillRect( i,290,20,20 );
		}
		for(i=310;i<=500;i=i+40)
		{
			g.setColor(Color.black);
			g.fillRect(680, i, 20, 20);
		}	
		for(i=330;i<=500;i=i+40)
		{
			g.setColor(Color.yellow);
			g.fillRect(680, i, 20, 20);
		}
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Font myFont = new Font ("Courier New", 1, 50);
		int j;
		for(j=5;j>0;j--)
		{
			String s=String.valueOf(j);
		g.setFont (myFont);
		g.setColor(Color.RED);
		g.fillOval(515,155,90,90);
		g.setColor(Color.WHITE);
		g.drawString(s, 550, 215);
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		g.setColor(Color.BLACK);
		g.clearRect(515, 155, 90, 90);
		g.drawArc(500, 140, 120, 120, 0, 180);
		g.drawOval(515, 155, 90, 90);
		for(j=3;j>0;j--)
		{
			String s=String.valueOf(j);
			g.setColor(Color.YELLOW);
		g.fillOval(515, 255, 90, 90);
		g.setColor(Color.WHITE);
		g.drawString(s, 550, 315);
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		}catch (InterruptedException e)
		{}
		}
		for(j=5;j>0;j--)
		{
			String s=String.valueOf(j);
		g.setColor(Color.BLACK);
		g.clearRect(515, 255, 90, 90);
		g.drawOval(515, 255, 90, 90);
		g.setColor(Color.GREEN);
		g.fillOval(515, 355, 90, 90);
		g.setColor(Color.WHITE);
		g.drawString(s, 550, 415);
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		g.setColor(Color.BLACK);
		g.clearRect(515, 355, 90, 90);
		g.drawArc(500, 340, 120, 120, 180, 180);
		g.drawOval(515, 355, 90, 90);
	}
}