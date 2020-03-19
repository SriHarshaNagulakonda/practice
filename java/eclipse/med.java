
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class med {
	public static void main(String args[])
	{
		JFrame j=new JFrame();
		j.setVisible(true);
		j.setLayout(null);
		j.setBounds(0, 0, 800, 800);
		Choice c=new Choice();
		c.add("Dettol");
		c.add("Cotton");
		c.add("Cough Syrup");
		c.add("Spirit");
		c.add("");
		c.setBounds(100, 100, 200, 50);
		Choice d=new Choice();
		for(int i=1;i<=10;i++)
			d.add(i+"");
		d.setBounds(400, 100, 100, 50);
		Button add=new Button("Add");
		add.setBounds(300,500,50,50);
		Button bill=new Button("Bill");
		bill.setBounds(400,500,50,50);		
		j.add(c);j.add(d);j.add(bill);j.add(add);
		bill x=new bill();
		String p[]=new String[5];
		int q[]=new int[5];
		add.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String x=c.getSelectedItem();
						int y=d.getSelectedIndex()+1;
						System.out.println(x+" "+y);
					}
				});
		bill.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				x.bill();
			}
		});		
	}
}
class bill
{
	void bill()
	{
		JFrame f=new JFrame("Bill");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(0, 0, 800, 800);
		Label name=new Label("Name");
		Label phno =new Label("Phone Number");
		name.setBounds(100, 100, 100, 50);
		phno.setBounds(100, 200, 100,50);
		f.add(name);f.add(phno);
		Label bill =new Label("Bill");
		bill.setBounds(200, 300, 100, 50);
	}
}