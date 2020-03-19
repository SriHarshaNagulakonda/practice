//Question15-Algorithm to find the largest sub array with equal number of 0's and 1's
import java.util.Scanner;

public class Ques15 {

	static int[] array(int a[],int x,int y)
	{
		int p[]=new int[y-x+1];
		for(int i=0;i<p.length;i++)
			p[i]=a[x+i];
		return p;
	}
	
	//taking 2 for loops checking all cases Brute Force
	//taking first 2 elements first and adding count of ones and zeroes in other variables,
	//then adding next element to this sub array and again checking the condition and if is greater than max length
	static int[] getSubArray(int a[])
	{
		int one=0,zero=0,max=0;
		int x=0,y=0;
		for(int i=0;i<a.length;i++)
		{
			one=0;zero=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]==0)
					zero++;
				else
					one++;
				if(one==zero)
				{
					if(j-1>max)
					{
						max=j-i;
						x=i;
						y=j;
					}
				}
			}
		}
		return array(a,x,y);
}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int k: getSubArray(a))
			System.out.print(k+" ");
	}

}


