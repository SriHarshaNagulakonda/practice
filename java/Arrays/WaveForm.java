//Question20-Given an array of integers, sort the array into 
//a wave like array and return it. (arrange the element into a sequence such that a1>=a2<=a3>=a4<=a5----etc.
import java.util.Arrays;
import java.util.Scanner;

public class WaveForm {
	
	static int max(int a[])
	{
		int m=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>m)
				m=a[i];
		}
		return m;
	}

	//firstly sort the array....then swap 2 2 elements
	
	static int[] getWave(int a[])
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i=i+2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		return a;
	}
	
	//first we take an array of size maximum element of the given array
	//increment it's indexes as per the given numbers
	//traverse from starting until we get second 1 and then we again come back until we get another 1,
	//and again we traverse until we get another 1 and print the elements accordingly

	
	static int[] getWave1(int a[])
	{
		int m=max(a);
		int b[]=new int[m+1];
		for(int i: a)
			b[i]=1;
		int i=0;
		int first=0;
		int k=0;
		int front=1;
		while(i<m+1) {
			
			if(b[i]==1 && front==1 && first==0) {
				first=1;
				//i++;
				front=1;
			}
			else if(b[i]==1 && first==1)
			{
				a[k++]=i;
				first=0;
				b[i]=0;
				front=0;
			}
			if(front==0 && b[i]==1)
			{
				a[k++]=i;
				front=1;
				b[i]=0;
			}
			if(front==0)
				i--;
			else
				i++;
			
		}
		return a;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i: getWave(a))
			System.out.print(i+" ");
		System.out.println();
		for(int i: getWave1(a))
			System.out.print(i+" ");
		
	}

}
