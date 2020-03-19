import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
public class awtComponents {
	public static void main(String args[])
	{
		JFrame f=new JFrame("Hello");
		Button b=new Button("Ok");
		f.setVisible(true);
		f.setBounds(0, 0, 1980, 1080);
		f.setLayout(null);
		TextField t1=new TextField();
		TextField t2=new TextField();
		t1.setBounds(400, 400, 500, 100);
		t2.setBounds(400, 600, 500, 100);
		t1.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e) {
				String s=t1.getText();
				t2.setText(s);
				if(t2.getText().equals("Harsha"))
					t1.setText("hello world");
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		f.add(t1);
		f.add(t2);
	}
}