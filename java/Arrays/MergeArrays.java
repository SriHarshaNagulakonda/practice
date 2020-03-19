//Question 8-Algorithm to merge an array of size 'n' into another array of size 'm+n'.

import java.util.Scanner;

public class MergeArrays {

	//taking array of size m+n and merging directly
	
	static int[] merge(int a[],int b[])
	{

		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int i=a.length;i<b.length+a.length;i++)
			c[i]=b[a.length-i];
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		for(int k: merge(a,b))
			System.out.print(k+" ");
		
	}
	
}
