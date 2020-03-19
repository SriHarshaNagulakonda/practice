//Question31-Given an array and an integer 'k', find the maximum, for each and every contiguous subarray of size 'k'
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaxOfSubArrays {

	static int getMax(int[] a,int i,int j)
	{
		int max=a[i];
		for(int k=i+1;k<j;k++)
		{
			if(a[k]>max)
				max=a[k];
		}
		return max;
	}
	
	
	static int max(ArrayDeque<Integer> q) {
		Deque<Integer> a=q.clone();
		int max=a.peek();
		while(!a.isEmpty())
		{
			int x=a.pop();
			if(max<x)
				max=x;
		}
		return max;
		
	}
	
	//bruteforce
	
	static int[] getMaxElements(int a[],int k)
	{
		int n=a.length;
		int b[]=new int[n-k+1];
		for(int i=0;i<n-k+1;i++)
		{
			b[i]=getMax(a,i,i+k);
		}
		return b;
	}
	
	//using deque
	
	static int[] getMaxElements1(int a[],int k)
	{
		int n=a.length;
		ArrayDeque<Integer> q=new ArrayDeque<Integer>(k);
		int b[]=new int[n-k+1];
		for(int i=0;i<k;i++)
			q.add(a[i]);
		int x=0;
		int m=max(q);
		b[x++]=m;
		for(int i=k;i<a.length;i++)
		{
			if(m==q.pop())
				m=max(q);
			if(m<a[i])
				m=a[i];
			q.add(a[i]);
			b[x++]=m;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		for(int i: getMaxElements(a,k))
			System.out.print(i+" ");
		System.out.println();
		for(int i: getMaxElements1(a,k))
			System.out.print(i+" ");
		
	}
	
}
