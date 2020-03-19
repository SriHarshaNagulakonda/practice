import java.util.Scanner;

public class string {
	
	public static void main(String[] args) {
	/*		String s="har,sha";
			System.out.println(s.codePointAt(1));
			System.out.println(s.codePointBefore(1));
			System.out.println(s.split(","));
			System.out.println(s.valueOf("a"));  */
			Scanner s= new Scanner(System.in);
			try
			{
				String str=s.next();
				if(!(str.substring(0, 5)).equals("17341"))
						throw new jntuException("Invalid");
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}
class jntuException extends Exception
{
	jntuException(String msg)
	{
		super(msg);
	}
}

