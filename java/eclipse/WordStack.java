import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class WordStack extends Applet{
	int i;
	String msg="H A R S H A",str="";
	public void init()
	{
		this.setSize(new Dimension(1980,1080));
	//	addKeyListener(this);
		requestFocus();
	}
	/*public void keyPressed(KeyEvent k) {}
	public void keyReleased(KeyEvent k) {}
	public void keyTyped(KeyEvent k)
	{
		str+=k.getKeyChar();
		showStatus(str);
		repaint();
	}*/
	public void paint(Graphics g)
	{
		TextField t1=new TextField();
		TextField t2=new TextField();
		t1.setBounds(100,100,100,50);
		add(t1);
		add(t2);
		t2.setBounds(100,300,100,50);
		t1.setVisible(true);
		t1.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				String s=t1.getText();
				t2.setText(s);
			}
			
			public void keyReleased(KeyEvent e){}
		});
		g.setFont(new Font("",Font.BOLD,30));
		g.drawLine(699,400,699,900);
		g.drawLine(699, 900, 1201, 900);
		g.drawLine(1201, 400, 1201, 900);
		for(i=0;i<=800;i+=100) {
			g.setColor(Color.BLACK);
		g.drawRect(700, i, 499, 100);
		g.setColor(Color.RED);
		g.fillRect(701, i, 499, 99);
		g.setColor(Color.WHITE);
		g.drawString(msg, 850, i+50);
		try {TimeUnit.MILLISECONDS.sleep(400);} catch(Exception e) {}
		g.clearRect(700, i, 500, 99);
		}
	}
}
