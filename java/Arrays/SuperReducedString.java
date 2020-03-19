import java.util.Scanner;

public class SuperReducedString {

	static String getReduced(String s)
	{
		String r="";
		while(s.length()>2)
		{
			r="";
			for(int i=0;i<s.length()-1;i++)
			{
				r+=s.charAt(i)-s.charAt(i+1);
			}
			s=r;
		}
		return s;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(getReduced(s));
		
	}

}
