import java.util.Scanner;



public class NextPermutation {

	static int getSmall(String s,int k)
	{
		char a='1';
		int x=0;
		for(int i=s.length()-1;i>0&&i>k;i--)
		{
			if(s.charAt(i)<s.charAt(k))
			{
				a=s.charAt(i);
				x=i;
			}
		}
		return x;
	}
	
	static String rev(String a)
	{
		StringBuilder sb=new StringBuilder(a);
		return sb.reverse().toString();
	}
	
	static String nextPermutation(String s) {
		
		int k=0,n=s.length();
		for(int i=n-1;i>0;i--)
		{
			if(s.charAt(i)<s.charAt(i-1))
				k++;
		}
		if(k==n-1)
			return "Doesn't Exist";
		char min=s.charAt(n-1);
		
		int temp=0;
		k=n-1;
		for(int i=n-1;i>0;i--)
		{
			if(s.charAt(i)>s.charAt(i-1)) {
				temp=getSmall(s,i-1);
				k=i-1;
				break;
			}
		}
		char[] a=s.toCharArray();
		//System.out.println(temp+""+k);
		
		char t=a[temp];
		a[temp]=a[k];
		a[k]=t;
		s=String.valueOf(a);
		System.out.println(s);
		s=s.substring(0,temp+1)+rev(s.substring(temp+1,n));
		
		return s;	
	
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(nextPermutation(n));

	}

}




