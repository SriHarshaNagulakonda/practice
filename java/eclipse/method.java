public class method {

	static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	static String max(String a,String b)
	{
		if(a.compareTo(b)>0)
		   return a;
		else
			return b;
	}
	public static void main(String[] args) {
		String s1="m";
		String s2="N";
		int a=1;
		int b=2;
		System.out.println(max(a,b));
		System.out.println(max(s1,s2));
	}
}
