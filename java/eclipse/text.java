import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;

import javax.swing.JFrame;

 class text {
static int s=0;
	public static void main(String args[])
	{
		JFrame f=new JFrame("Text");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(0, 0, 1000, 1000);
		TextField t=new TextField();
		t.setBounds(100, 100, 300, 100);
		f.add(t);
		t.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e)
			{
				try {
				 s = Integer.parseInt(t.getText());
				if(s<100&&s>200)
				{
					
				}
				}catch(Exception ex) {}
				}
		});
	}
}
