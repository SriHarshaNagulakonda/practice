import java.awt.*;
public class testframe extends Frame {
	public testframe(String title)
	{
		super(title);
	}	
		@SuppressWarnings("deprecation")
		public static void main(String[] args)
		{
			Frame f=new testframe("Hello");
			f.setSize(1000, 500);
			f.setLocation(100, 100);
			f.show();
			Button b=new Button("Hello");
			b.setBounds(200, 200, 20, 20);
			add(b);
		}
}

