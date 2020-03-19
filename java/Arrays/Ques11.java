//Question11-Find the index in an array such that the sum of elements at lower indices is equal to the sum of elements at higher indices.
import java.util.Scanner;

public class Ques11 {

	//calculating sum of elements of before indexes and after indexes and checking equality	Brute Force Method O(n2)
	
	static String getIndex(int a[])
	{
		
		for(int i=1;i<a.length-1;i++)
		{
			int l=0,r=0;
			for(int j=0;j<i;j++)
				l+=a[j];
			for(int k=i+1;k<a.length;k++)
				r+=a[k];
			if(l==r)
				return i+"";
		}
		return "Doesn't Exist";
		
	}
	
	//finding sum of all elements, taking another variable and adding first element to it and subtracting it from total sum and checing equality O(n)
	
	static String getIndex1(int a[])
	{
		
		int r=0;
		for(int i=2;i<a.length;i++)
			r+=a[i];
		int l=0;
		for(int i=1;i<a.length-1;i++)
		{
			l+=a[i-1];
			r-=a[i+1];
			if(l==r)
				return i+"";
		}
		return "Doesn't Exist";
			
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println(getIndex(a));
		System.out.println(getIndex1(a));
		
		
	}

}
