//Question16-Algorithm to find the number of triangles that can be formed 
//with three different array elements as three sides of triangles, for a given unsorted array of n elements

import java.util.Arrays;
import java.util.Scanner;

public class Triangles {

	//using 3 for loops
	//in first 2 for loops adding elements of a[i] and a[j] and comparing if the sum is greater than a[k] or not and counting all possible cases

	
	static int getCount(int a[])
	{
		
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]>a[k] && a[j]+a[k]>a[i] && a[i]+a[k]>a[j])
					{
						System.out.println(a[i]+","+a[j]+","+a[k]);
						c++;
					}
				}
			}
		}
		return c;
	
	}
	
	//first element at i suppose
	//last element at j
	//and then the picking the 3rd element
	//based on the sum we have move the i and j
	//if sum is less than the element fixed we increase i value else decrease the j value
	
	
	static int getCount1(int a[])
	{
		Arrays.sort(a);
		int j,k;
		for(int i=0;i<a.length-1;i++)
		{
			j=i+1;k=a.length-1;
			while(j<k)
			{
				if(a[j]+a[k]>a[i] && a[i]+a[j]>a[k] && a[i]+a[k]>a[j])
					System.out.println(a[i]+","+a[j]+","+a[k]);
				else if(a[j]+a[k]<a[i])
					j++;
				else
					k--;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(getCount(a));
		System.out.println(getCount1(a));
	}

}
