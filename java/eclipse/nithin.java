import java.applet.*;
import java.awt.*;
public class nithin extends Applet{
		 public void paint(Graphics g)
		 {
			 g.drawLine(100, 100, 200, 200); 
			 g.setColor(Color.BLUE);
			 g.drawLine(200, 100, 100, 200);
			 g.drawRect(100, 100, 200, 200);
			 g.setColor(Color.RED);
			 g.fillRect(100, 100, 100, 100);
			 g.setColor(Color.blue);
			 g.drawString("Nithin", 110, 110);
			 g.fillOval(200, 200, 100, 50);
			//
			 g.drawArc(x, y, width, height, startAngle, arcAngle);
		 }
}