import java.io.*;
public class file {
	public static void main(String args[])
	{
		FileWriter f;
		FileReader fr;
		try {
			
			f = new FileWriter("D:/Hello.txt",true);
		/*	f.write("Hello");
			f.write("Hello");
			f.write("Hello");*/
f.write("a\n");
BufferedWriter bw = new BufferedWriter(new FileWriter("D:/out.txt",true));
bw.write("hello");
bw.newLine();
bw.write("gud mrng");
bw.newLine();
bw.close();
			f.close();
			fr =new FileReader("D:/Hello.txt");
		    BufferedReader reader = new BufferedReader(new FileReader("D:/out.txt"));
		    String x;
		    while(!(x=reader.readLine()).equals(null))
		    System.out.println(x);
		    //reader.
	//		fr.
	//		fr.close();
		} 
		catch (IOException e) {}
	}
}
