//Question 1-Find a pair in an array of size 'n', whose sum is X
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Fixed_Sum_Pair {
	//1. Using 2 for Loops
	static String get_pair(int a[],int sum) {
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
					return a[i]+","+a[j];
			}
		}
		return "No Pairs";
		
	}
	//2. Sorting and then 2 loops
	static String get_pair1(int a[],int sum) {
		
		Arrays.sort(a);
		int i=0,j=a.length-1;
		while(i<j) {
			
			if(a[i]+a[j]==sum)
				return a[i]+","+a[j];
			if(a[i]+a[j]>sum)
				j--;
			if(a[i]+a[j]<sum)
				i++;
		}
		
		return "No Pairs";
		
		
	}
	//3. Complement/using another array using the concept of a=sum-b;
	static String get_pair2(int a[],int sum)
	{
		HashMap<Integer,Integer> b=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(b.get(a[i])==null) {
				b.put(a[i],1);
				b.put(sum-a[i],0);
			}
			else if(b.get(a[i])==0) {
				return String.valueOf(sum-a[i])+','+a[i];
			}
				
		}
		return "No Pairs";
	}

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=sc.nextInt();
		System.out.println(get_pair(a,sum));
		System.out.println(get_pair1(a,sum));
		System.out.println(get_pair2(a,sum));
		
	}

}


