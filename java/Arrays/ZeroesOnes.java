//Question6-Algorithm to segregate 0's and 1's in an array
import java.util.Scanner;

public class ZeroesOnes {

	static void find(int a[],int zero,int one)
	{
		int x[]=new int[zero];
		int y[]=new int[one];
		for(int i=0;i<x.length;i++)
			x[i]=0;
		for(int i=0;i<y.length;i++)
			y[i]=1;
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		System.out.println();
		for(int i=0;i<y.length;i++)
			System.out.print(y[i]+" ");
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int zero=0,one=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]==0)
				zero++;
			else
				one++;
		}
		find(a,zero,one);
		
	}

}
