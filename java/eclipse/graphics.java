import java.util.*;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.applet.Applet;
public class graphics extends Applet{
  public void paint(Graphics s)
  {
	  s.drawRect(400, 300, 100, 200);
	  s.drawLine(400,300,450,200);
	  s.drawLine(450, 200, 500, 300);
	  s.drawLine(450, 200, 650, 200);
	  s.drawLine(650,200,700,300);
	  s.drawLine(700, 300, 500, 300);
	  s.drawLine(700,300,700,500);
	  s.drawLine(700, 500, 500, 500);
	  s.drawRect(430, 420, 40, 80);
 
	 // s.drawString("Hello World", 100, 100);
	//  s.drawOval(0, 0, 100, 50);
	  
  }
}