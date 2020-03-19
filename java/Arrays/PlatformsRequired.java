//Question24-Algorithm to find the minimum number of platforms required for the railway station so that no 
//train waits according to arrival and departure time


import java.util.Scanner;

public class PlatformsRequired{

	static boolean timeCompare(int x[],int y[])
	{
		int h1=x[0],m1=x[1],h2=y[0],m2=y[1];
		if(h1<=h2)
			return false;
		if(h1>h2)
			return true;
		if(m1<=m2)
			return false;
		return true;
	}
	
	//first we take both arr time and dep time in two arrays (edited) 
	//first we take count=0
	//then we check whether the next arrival time is in between all intervals
	//if it is between all intervals then we need anohter platform so, we increase count
	
	
	static int getPlatformCount(int[][] a,int[][] b) {
		
		int count=1;
		for(int i=1;i<a.length;i++)
		{
			int k=0;
			for(int j=0;j<i;j++)
			{
				if(timeCompare(a[j],a[i])||timeCompare(a[i],b[j])) {
					k=1;
					break;
				}
			}
			if(k==0)
				count++;
		}
		return count;
		
	}
	
	static int getPlatformCount1(int[][] a,int[][] b)
	{
		return 0;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		int dep[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			dep[i][0]=sc.nextInt();
			dep[i][1]=sc.nextInt();
		}
		
		System.out.println(getPlatformCount(arr,dep));
		System.out.println(getPlatformCount1(arr,dep));
		
	}

}
