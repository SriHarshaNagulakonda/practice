//Question13-Algorithm to find the triplet whose sum is X

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

	static int[] array(int x,int y,int z)
	{
		int p[]=new int[3];
		p[0]=x;p[1]=y;p[2]=z;
		return p;
	}
	
	//using 3 for loops and checking every element with every 2 other elements and checkingt the sumO(n3)
	
	static int[] getTriplet(int a[],int sum)
	{
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
						return array(a[i],a[j],a[k]);
				}
			}
		}
		return null;
	}
	
	//taking first element fixed ,second element(i) and last element(j) we will find the sum if the sum is greater we will increment i to i+1 and else we decrement j to j-1 and check equality. then we will take the next element is fixed O(n2)
	
	
	static int[] getTriplet1(int a[],int sum)
	{
		Arrays.sort(a);
		int x,s=0,i,j;
		for(int k=0;k<a.length-2;k++)
		{
			x=a[k];
			i=k+1;j=a.length-1;
			while(i<j) {
				
				if(x+a[i]+a[j]==sum)
					return array(a[k],a[i],a[j]);
				if(x+a[i]+a[j]>sum)
					j--;
				if(x+a[i]+a[j]<sum)
					i++;
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
		for(int k: getTriplet(a, sum))
			System.out.print(k+" ");
		System.out.println();
		for(int k: getTriplet1(a, sum))
			System.out.print(k+" ");
	}

}
