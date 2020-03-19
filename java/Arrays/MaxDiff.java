//Question7-Find the maximum difference between two elements such that larger element appears after the smaller element

import java.util.Scanner;

public class MaxDiff {

	//first we intialise max with subtraction of 1st eement and 2nd elemnt.Then iterating loop from index 1 to n and any difference is maximum the initial we will store in max variable
	
	static int maxDiff(int a[]) {
		
		int max=a[1]-a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int d=a[j]-a[i];
				if(d>max)
					max=d;
			}
		}
		return max;
		
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(maxDiff(a));
	}

}
