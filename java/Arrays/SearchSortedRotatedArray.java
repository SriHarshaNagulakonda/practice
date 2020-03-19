//Question32-searching an element in a sorted array
import java.util.Arrays;
import java.util.Scanner;

public class SearchSortedRotatedArray {

	//1) using linear search
	
	static int search(int a[],int k)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
				return i;
		}
		return -1;
	}
	
	//2) rotating it to become it sorted and applying binary search (edited) 
	
	static int search1(int a[],int k)
	{
		int n=a.length;
		int b[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				j=i;
				break;
			}
		}
		int x=0;
		for(int i=j+1;i<n;i++)
			b[x++]=a[i];
		for(int i=0;i<=j;i++)
			b[x++]=a[i];
		x=Arrays.binarySearch(b,k);
		if(x>=n-j+1)
			return j+x;
		return j-x+1;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(search(a,k));
		System.out.println(search1(a,k));
		
	}

}
