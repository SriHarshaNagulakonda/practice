import java.util.Scanner;

public class stringg {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		//s2.indexOf("t")==s1.indexOf("t",1);
		System.out.println(s1.indexOf(s2.charAt(0),1));
	}
}
