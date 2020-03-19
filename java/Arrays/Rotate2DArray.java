//Question25-Rotate 2-Dimentional array

import java.util.Scanner;

public class Rotate2DArray {

	static int[][] transpose(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[i].length;j++)
			{
				int temp=a[j][i];
				a[j][i]=a[i][j];
				a[i][j]=temp;
			}
		}
		return a;
	}
	
	//by taking one more matrix we can assign values in it sir
	
	static int[][] rotateMatrixClock(int a[][])
	{
		int m=a.length,n=a[0].length;
		int b[][]=new int[n][m];
		int x=n-1,y=0;
		for(int i=0;i<n;i++)
		{
			x=n-1;
			for(int j=0;j<m;j++)
			{
				b[i][j]=a[x][y];
				x--;
			}
			y++;
		}
		return b;
	}
	
	//transposing the matrix and then swapping its columns
	
	static int[][] rotateMatrixClock1(int a[][])
	{
		
		int m=a.length,n=a[0].length;
		a=transpose(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length/2;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[i][n-j-1];
				a[i][n-j-1]=temp;
			}
		}
		return a;
		
	}
	
	//by taking one more matrix we can assign values in it sir
	
	static int[][] rotateMatrixAntiClock(int a[][])
	{
		int m=a.length,n=a[0].length;
		int b[][]=new int[n][m];
		int x=n-1,y=0;
		for(int i=0;i<n;i++)
		{
			y=0;
			for(int j=0;j<m;j++)
			{
				b[i][j]=a[y][x];
				y++;
			}
			x--;
		}
		return b;
	}
	
	//transposing the matrix and then swapping its rows
	
	static int[][] rotateMatrixAntiClock1(int a[][])
	{
		int m=a.length,n=a[0].length;
		a=transpose(a);
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[n-i-1][j];
				a[n-i-1][j]=temp;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int [m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Original Array");
		for(int[] i: a)
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println("Clock Wise");
		for(int[] i: rotateMatrixClock(a))
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println();
		for(int[] i: rotateMatrixClock1(a))
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println("Anti ClockWise");
		
		
		for(int[] i: rotateMatrixAntiClock(a))
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		
		for(int[] i: rotateMatrixAntiClock1(a))
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		
	}

}
