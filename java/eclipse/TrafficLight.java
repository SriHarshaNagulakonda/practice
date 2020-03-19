import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;
public class TrafficLight extends Applet {
	public void init()
	{
		this.setSize(new Dimension(1980,1080));
	}
	public void paint(Graphics g)
	{
	int i;
	for(i=0;i<3;i++)
		{
		g.drawLine(500, 200, 500,400);
		g.drawArc(500, 140, 120, 120, 0, 180);
		g.drawLine(620, 200, 620, 400);
		g.drawArc(500, 340, 120, 120, 180, 180);
		g.drawOval(515, 155, 90, 90);
		g.drawOval(515, 255, 90, 90);
		g.drawOval(515, 355, 90, 90);
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {}
		g.setColor(Color.RED);
		g.fillOval(515,155,90,90);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		g.setColor(Color.BLACK);
		g.clearRect(515, 155, 90, 90);
		g.drawArc(500, 140, 120, 120, 0, 180);
		g.drawOval(515, 155, 90, 90);
		g.setColor(Color.YELLOW);
		g.fillOval(515, 255, 90, 90);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		g.setColor(Color.BLACK);
		g.clearRect(515, 255, 90, 90);
		g.drawOval(515, 255, 90, 90);
		g.setColor(Color.GREEN);
		g.fillOval(515, 355, 90, 90);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		g.setColor(Color.BLACK);
		g.clearRect(515, 355, 90, 90);
		g.drawArc(500, 340, 120, 120, 180, 180);
		g.drawOval(515, 355, 90, 90);
	}
}
}
