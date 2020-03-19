import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class mouse extends Applet implements MouseListener{
int x,y;
String msg;
	public void init()
	{
	addMouseListener( this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=0;
		y=10;
		msg="clicked";		
		//repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}