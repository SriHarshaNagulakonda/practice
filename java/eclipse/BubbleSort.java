import java.util.*;
import java.lang.*;
import java.io.*;
class BubbleSorting {
   int[] sort(int a[])
   {
	  int n=a.length;
	  int temp=0,min,k,i,j;
	  for(i=0;i<n-1;i++)
	  {
		  k=-1;
		  min=a[i];
		  for( j=i+1;j<n;j++)
		  {
			  if(a[j]<min)
			  {
				  min=a[j];
				  k=j;
			  }
		  }
		  if(k==-1)
			  continue;
		  if(a[i]>a[k])
		  {
			  temp=a[i];
			  a[i]=a[k];
			  a[k]=temp;
		  }
	  }
	  return a;
   }
}
class BubbleDisplay extends BubbleSorting
{
	int n;
	public void display(int a[])
	{
		System.out.println("Array after sorting");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
	}
}	
public class BubbleSort
{
	public static void main(String[] args) {
		int n,i;
     System.out.println("Enter no. of elements");
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     int a[]=new int[n];
     System.out.println("Enter "+n+"Elements");
     for( i=0;i<n;i++)
     {
    	 a[i]=s.nextInt();
     }
     System.out.println("Elements before Sorting are");
     for(i=0;i<n;i++)
    	 System.out.println(a[i]+" ");
     BubbleDisplay obj=new BubbleDisplay();
     a=obj.sort(a);
     obj.display(a);
}

}
