//Question17-Algorithm to find the smallest integer value that can't be represented as sum of any subset(subarray) of a given array.

import java.util.HashMap;
import java.util.Scanner;

public class SmallestSumSubArray {

	static int getElement(int a[])
	{
		int j=0,s=a[0];
		int b[][]=new int[a.length][a.length];
		b[0][0]=s;
		int m=a[0]+a[1];
		HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
		for(int i: a)
			x.put(i,1);
		for(int i=1;i<b.length;i++) {
			b[0][i]=b[0][i-1]+a[i];
			if(x.containsKey(b[0][i])&&b[0][i]<m)
				m=b[0][i];

		}
		for(int i=1;i<b.length;i++)
		{
			b[i][i]=a[i];
			for(j=i+1;j<b.length;j++)
			{
				b[i][j]=b[i][j-1]+a[j];
				if(x.containsKey(b[i][j])&&b[i][j]<m)
					m=b[i][j];
			}
		}
		return m;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(getElement(a));
		
	}

}
