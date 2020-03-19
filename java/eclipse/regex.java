import java.util.regex.*;
public class regex {
	public static void main(String args[])
	{
		Pattern p=Pattern.compile(".s");
		System.out.println(p);
		Matcher m=p.matcher("as");
		System.out.println(m.matches());
		String s="abcdef";
		System.out.println(s.matches("abc"));
	}
}
