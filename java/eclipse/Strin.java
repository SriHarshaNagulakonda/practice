import java.util.Scanner;
public class Strin {
	static String decode(String a)
	{
		String s="";
		for(int i=0;i<a.length();i++)
		{
			s+=(int)a.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(decode(s.nextLine()));
	}
}