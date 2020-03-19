//Question2-Find a majority element in an array of size 'n'
import java.util.HashMap;
import java.util.Scanner;

public class Majority {
	
	//mapping them using hash map
	static String getMajority(int a[])
	{
		HashMap<Integer,Integer> b=new HashMap<Integer,Integer>();
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
			if(b.get(i)>max) {
				max=b.get(i);
				j=i;
			}
		}
		if(max>a.length/2)
			return j+"";
		else
			return "Doesn't Exist";
	}

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		
	}

}
