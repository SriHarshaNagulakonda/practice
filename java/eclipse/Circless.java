import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Circles extends Applet{
	public void paint(Graphics g)
	{
		
		int i,n,d;
	//	for(n=1;n<=8;n++)
		//{
			for(d=1;d<=8;d++)
			{
			for(i=0;i<=100*360;i++)
		{
				g.setColor(Color.BLUE);
				
			int r=(int) (400*Math.cos(i*0.0174*n/d));
			int x=(int) (r*Math.cos(i*0.0174));
			int y=(int) (r*Math.sin(i*0.0174));
			g.drawLine(700+x,450+ y,700+ x,450+ y);			
		}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			g.clearRect(0, 0, 2000, 2000);
		//}
	}
	}
}