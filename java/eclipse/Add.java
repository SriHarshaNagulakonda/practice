import java.util.Scanner;
/*class Add
{
	int n;
	int[] method(int a[],int b[])
	{
		int c[]=new int[n];
		for(int i=0;i<n;i++)
			c[i]=a[i]+b[i];
		return c;
	}
	Add(int n)
	{
		this.n=n;
	}
}*/
public class Add{
	int n;
	int[] method(int a[],int b[])
	{
		int c[]=new int[n];
		for(int i=0;i<n;i++)
			c[i]=a[i]+b[i];
		return c;
	}
	Add(int n)
	{
		this.n=n;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    	a[i]=s.nextInt();
	    int b[]=new int[n];
	    for(int i=0;i<n;i++)
	    	b[i]=s.nextInt();
	    a=method(a,b);
	    for(int i=0;i<n;i++)
	    	System.out.print(a[i]+" ");
	    a=method(a, b);
	    for(int i=0;i<n;i++)
	    	System.out.print(a[i]+" ");
	}
}
