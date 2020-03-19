//Question5-Algorithm to rotate array of size 'n' by 'd' elements
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	//1. using the another array storing those elements up to d and then print the n-d to n then print the stored array
	
	static int[] rotate(int a[],int k)
	{
		int n=a.length;
		int temp=a[0];
		int i;
		for(int j=0;j<k;j++) {
			temp=a[0];
			for( i=0;i<n-1;i++)
				a[i%n]=a[i+1%n];
			a[i]=temp;
		}
		return a;
	}
	
	//shift the each element by one repeat the same for d times
	
	static int[] rotate1(int a[],int k)
	{
		int n=a.length;
		k=k%n;
		int temp=a[k-1];
		int i;
		int b[]=new int[n];
		for(i=0;i<n-k;i++)
			b[i]=a[k+i];
		int j=0;
		for(i=n-k;i<n;i++)
			b[i]=a[j++];
		
		
		return b;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int[] b=Arrays.copyOf(a,a.length);
		int k=sc.nextInt();
		int a1[]=rotate(a,k);
		for(int j=0;j<n;j++)
			System.out.print(a1[j]+" ");
		a1=rotate1(b,k);
		System.out.println();
		for(int j=0;j<n;j++)
			System.out.print(a1[j]+" ");
		
				
	}

}
