import java.util.HashMap;
import java.util.Scanner;

public class Mode {
	
	static int getMaxIndex(int a[]) {
		
		int max=a[0],j = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
				j=i;
			}
		}
		return j;
		
	}
	
	static int getMode(int a[])
	{
		int b[]=new int[a[getMaxIndex(a)]+1];
		for(int i=0;i<a.length;i++)
			b[a[i]]++;
		return getMaxIndex(b);
	}
	
	static int getMode1(int a[])
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
		//System.out.println(b.keySet());
		for(int i: b.keySet())
		{
			if(b.get(i)>max) {
				max=b.get(i);
				j=i;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(getMode(a));
		System.out.println(getMode1(a));
		
	}

}
