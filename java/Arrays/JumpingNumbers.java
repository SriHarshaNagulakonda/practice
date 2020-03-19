//Question30-Given a positive number X, print all jumping numbers(all adjacent digits in it differ by 1) smaller than or equal to X

import java.util.ArrayList;
import java.util.Scanner;

public class JumpingNumbers {

	static boolean isJumping(int s)
	{
		char[] a=String.valueOf(s).toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
			if(Math.abs(a[i]-a[i+1])!=1)
				return false;
		}
		return true;
	}

	//Brute Force, checking every value from 1 to x and checking whether it is jumping or not and printing them
	//Complexity O(x)
	
	static ArrayList<Integer> getJumpingNumbers(int a)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=a;i++)
		{
			if(isJumping(i))
				al.add(i);
		}
		return al;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i: getJumpingNumbers(n))
			System.out.print(i+" ");
		
	}

}
