//Question19-Algorithm to find the contiguous sub-array with maximum sum, for a given array of postive and negative numbers.

import java.util.Scanner;

public class MaximumSum_SubArray {

	//BruteForce 
	
	static int getMax(int a[])
	{
		int i=0,j=0,s=a[0];
		int b[][]=new int[a.length][a.length];
		b[0][0]=s;
		for(i=1;i<b.length;i++) {
			b[0][i]=b[0][i-1]+a[i];
			if(b[0][i]>s)
				s=b[0][i];
		}
		for(i=1;i<b.length;i++)
		{
			b[i][i]=a[i];
			if(b[i][i]>s)
				b[i][i]=s;
			for(j=i+1;j<b.length;j++)
			{
				b[i][j]=b[i][j-1]+a[j];
				if(b[i][j]>s)
					s=b[i][j];
			}
		}
		return s;
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(getMax(a));
		
	}

}
