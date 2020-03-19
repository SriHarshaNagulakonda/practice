//Question4-Algorithm to reverse an array

import java.util.Scanner;

public class Reverse{
	
	//taking another array and placing elements from reverse order.
	
	static int[] reverse(int a[]){
		int b[]=new int[a.length];
		int n=a.length;
		for(int i=0;i<a.length;i++)
			b[n-i-1]=a[i];
		return b;
		}
	
	static int[] reverse1(int a[]){
		int n=a.length;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[n-i-1];
			a[n-i-1]=a[i];
			a[i]=temp;
		}
		
		return a;
		
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int temp[]=reverse(a);
		for(int i=0;i<n;i++)
			System.out.print(temp[i]+" ");
		temp=reverse1(a);
		for(int i=0;i<n;i++)
			System.out.print(temp[i]+" ");
		}
}
