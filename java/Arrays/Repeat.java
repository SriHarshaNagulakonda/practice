//Question9-Algorithm to find two repeating numbers in a given array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Repeat {

	//checking for all repeated elements and then returning them
	
	static ArrayList<Integer> repeat(int a[])
	{
		ArrayList<Integer> r=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				if(a[i]==a[j]) {
					r.add(a[i]);
				}
				
		}
		return r;
		
	}
	
	//sorting them and comparing the adjacent elements.
	
	static ArrayList<Integer> repeat1(int[] a) {
		ArrayList<Integer> r=new ArrayList<Integer>();
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				r.add(a[i]);
		}
		return r;
	}
	
	//conting all the elements in an hash map and then checking the condition for it is greater than 1 or not.
	
	static ArrayList<Integer> repeat2(int a[])
	{
		HashMap<Integer,Integer> b=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(b.get(a[i])==null)
				b.put(a[i],1);
			else
				b.put(a[i],b.get(a[i])+1);
		}
		ArrayList<Integer> r=new ArrayList<Integer>();
		for(int i: b.keySet())
		{
			if(b.get(i)==2) {
				r.add(i);
			}
		}
		return r;
	}
	
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(Integer k: repeat(a))
			System.out.print(k+" ");
		System.out.println();
		for(Integer k: repeat1(a))
			System.out.print(k+" ");
		System.out.println();
		for(Integer k: repeat2(a))
			System.out.print(k+" ");
		
	}

}
