//Question-14 Algorithm to find a sub array whose sum is X

import java.util.Scanner;

public class SubArraySum {

	static int[] array(int a[],int x,int y)
	{
		int p[]=new int[y-x+1];
		for(int i=0;i<p.length;i++)
			p[i]=a[x+i];
		return p;
	}
	
	//using a matrix representation (dynamic programming)
	
	static int[] getSubArray(int a[],int sum)
	{
		int b[][]=new int[a.length][a.length];
		b[0][0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			b[0][i]=b[0][i-1]+a[i];
			if(b[0][i]==sum)
				return array(a,0,i);
		}
		for(int i=1;i<a.length;i++)
		{
			b[i][i]=a[i];
			if(b[i][i]==sum)
				return array(a, i,i);
			for(int j=i+1;j<a.length;j++)
			{
				b[i][j]=b[i][j-1]+a[j];
				if(b[i][j]==sum)
					return array(a,i,j);
			}
		}
		return null;
	}
	
	//consider the 1st element and take it as a sub array
	//start from the 2nd element and add the elements one by one
	//if that is equal to the sum ...return it
	//if the adding element > sum remove it
	//If sum of the subarray elements exceeds the sum, then remove before elements while sum of the sub array elemts is greater than sum.
	
	
	static int[] getSubArray1(int a[],int sum)
	{
		int i=0,n=a.length, j=1, s=a[0];
		while(i<n)
		{
			if(s==sum)
				return array(a,i,j-1);
			if(s<sum)
			{
				s=s+a[j];
				j=j+1;
			}
			else if(s>sum)
			{
				s=s-a[i];
				i=i+1;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=sc.nextInt();
		for(int k: getSubArray(a, sum))
			System.out.print(k+" ");
		System.out.println();
		for(int k: getSubArray1(a, sum))
			System.out.print(k+" ");
	}

}
