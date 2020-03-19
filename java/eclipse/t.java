import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

public class t extends Applet {
	public void paint(Graphics g)
	{
//	int i;
		
		g.fillRect(800,0,200,1000);
		g.fillRect(0, 500, 2000, 200);
		g.clearRect(10,520,800,10);
		g.clearRect(990,520,1000,20);
		g.clearRect(820,10,10,790);
		g.drawLine(500, 200, 500,400);
		g.drawArc(500, 140, 120, 120, 0, 180);
		g.drawLine(620, 200, 620, 400);
		g.drawArc(500, 340, 120, 120, 180, 180);
		g.drawOval(515, 155, 90, 90);
		g.drawOval(515, 255, 90, 90);
		g.drawOval(515, 355, 90, 90);
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
		for(j=5;j>0;j--)
		{
			String s=String.valueOf(j);
			g.setColor(Color.YELLOW);
		g.fillOval(515, 255, 90, 90);
		g.setColor(Color.WHITE);
		g.drawString(s, 550, 315);
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.BLACK);
		g.clearRect(515, 355, 90, 90);
		g.drawArc(500, 340, 120, 120, 180, 180);
		g.drawOval(515, 355, 90, 90);
}
}