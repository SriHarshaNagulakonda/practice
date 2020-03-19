//Question10-Algorithm to find duplicate elements in O(n) time and O(1) extra space, for a given array of size 'n'

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
	
	//adding them into the hashset and it returns false if the element already exists.
	
	static ArrayList<Integer> dup(int a[]) {
		HashSet<Integer> x=new HashSet<Integer>();
		ArrayList<Integer> r=new ArrayList<Integer>();
		for(int i: a)
		{
			if(x.add(i)==false)
				r.add(i);
		}
		return r;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(Integer k: dup(a))
			System.out.print(k+" ");
		
		
	}

}


