//Question 3-Find the number occuring odd number of times in a given array of size 'n'


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MaxOdd {

	//counting the number of occurances using the hash map and returning a array list.
	
	static ArrayList<Integer> maxOdd(int[] a) {

		HashMap<Integer,Integer> b=new HashMap<Integer,Integer>();
		ArrayList<Integer> x=new ArrayList<Integer>();

		
		for(int i=0;i<a.length;i++)
		{
			if(b.get(a[i])==null)
				b.put(a[i],1);
			else
				b.put(a[i],b.get(a[i])+1);
		}
		int max=0,j=0;

		for(int i: b.keySet())
		{
			if(b.get(i)%2==1) {
				x.add(i);
			}
		}
		
		return x;
	}

	
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(maxOdd(a));
		for(Integer x: maxOdd(a))
			System.out.print(x+",");
		
	}
	
	
	
}
