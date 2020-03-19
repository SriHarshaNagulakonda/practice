//Question26-Lock and Key problem

import java.util.HashMap;
import java.util.Scanner;

public class LockAndKey {

	//we take two arrays..such that. one is locks and another is key....now compare each lockk with each key
	//if we find a match we print it.....we will get it in the same order as lock array....if match not found....we dont print it
	
	static char[] getKeys(char a[],char b[])
	{
		String s="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j]) {
					s+=a[i];
					break;
				}
			}
		}
		return s.toCharArray();
	}

	//we use a hash map and mark all locks with 1 sir, then we use the same hash map and mark 
	//all the marked ones previously with 2's, all the 2's  are our answers
	
	static char[] getKeys1(char a[],char b[])
	{
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<a.length;i++)
			m.put(a[i],1);
		String s="";
		for(int i=0;i<b.length;i++)
		{
			if(m.get(b[i])!=null&&m.get(b[i])==1) 
				s+=b[i];
		}
		return s.toCharArray();
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		String a=sc.next();
		String b=sc.next();
		
		System.out.println();
		for(char i: getKeys(a.toCharArray(),b.toCharArray()))
			System.out.print(i+" ");

		for(char i: getKeys1(a.toCharArray(),b.toCharArray()))
			System.out.print(i+" ");
		
		
	}
	
}
