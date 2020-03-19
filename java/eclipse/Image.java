import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
public class Image {
	public static void main(String[] args) {
		Statement a;  
		ResultSet b;
		b=a.
		JFrame f=new JFrame("Hello World");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(0, 0, 1980, 1080);
		try {
			BufferedImage j = ImageIO.read(new File("D:/pic.jpg"));
			JLabel i=new JLabel(new ImageIcon(j));
			i.setBounds(100, 100, 800, 800);
			f.add(i);
		} catch (IOException e) {}
	}
}