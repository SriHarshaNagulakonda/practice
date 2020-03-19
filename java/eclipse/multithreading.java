import java.util.Scanner;

public class multithreading {
	public static void main(String args[])
	{
		int d,a,b,c;
		System.out.println("Enter a and b values");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		try{
			 d=a*b;
				System.out.println(d);
			c=a/b;
			System.out.println(c+"Hi"+d);
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hi");
		}
}
