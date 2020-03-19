//Question33-Find the maximum value of a[j]-a[i]+a[l]-a[k], for every four indices i, j, k, l such that i< j < k < l.

import java.util.Scanner;

public class Ques33 {

	static int getMax(int a[])
	{
		int n=a.length;
		int m=a[0]-a[1]+a[2]-a[3];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					for(int l=k+1;l<n;l++)
					{
						if(a[i]-a[j]+a[k]-a[l]>m)
							m=a[i]-a[j]+a[k]-a[l];
					}
				}
			}
		}
		return m;
	}
	
	static int getMax1(int a[])
	{
		int n=a.length;
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		return 0;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(getMax(a));
	}
	
}
