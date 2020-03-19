//Question29-Given an array consisting 0's, 1's and 2's, write a algorithm to sort it
import java.util.Arrays;
import java.util.Scanner;

public class ZeroesOnesTwos {

	// original sorting sir
	
	static int[] getSorted(int x[])
	{
		Arrays.sort(x);
		return x;
	}
	
	//using 3 variables and counting the no. of zeroes ones and twos and creating another 
	//array of size the above size and storing elements of that count
	
	static int[] getSorted1(int a[])
	{
		int b[]=new int[a.length];
		int x=0,y=0,z=0;
		for(int i: a)
		{
			if(i==0)
				x++;
			else if(i==1)
				y++;
			else
				z++;
		}
		for(int i=0;i<x;i++)
			b[i]=0;
		for(int i=x;i<x+y;i++)
			b[i]=1;
		for(int i=x+y;i<x+y+z;i++)
			b[i]=2;
		return b;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i: getSorted(a))
			System.out.print(i+" ");
		System.out.println();
		for(int i: getSorted1(a))
			System.out.print(i+" ");
		
	}

}
