import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Game extends Applet implements KeyListener{
	String msg=" har ";
	public void init() {
		addKeyListener(this);
		requestFocus();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		char a= e.getKeyChar();
		msg+=a;
		repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	public void paint(Graphics g)
	{
		//addKeyListener(this);
		int i=0;
		g.setFont(new Font("Times New Roman",Font.BOLD,50));
		for(i=0;i<800;i=i+20) {
			g.setColor(Color.RED);
			g.fillOval(800, 800-i, 100, 100);
			g.setColor(Color.WHITE);
			g.drawString(msg,840,870-i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
			g.clearRect(0, 0, 1980, 1080);
		}
	}
}