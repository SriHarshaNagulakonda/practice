import java.lang.Math.*;
import java.util.*;
class Stack1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=s.nextInt();
        Stack in=new Stack();
        Stack temp=new Stack();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {   
            arr[i]=s.nextInt();
            in.push(arr[i]);
        }
        temp=in;
        int j,x,y=1,k=0;
        int a[]= new int[p];
        for(i=1;y<=p;i++)
        {
        	for(j=1;j<=i;j++)
        	{
        		if(i%j==0)
        		{
        			k++;
        		}
        	}
        	if(k==2)
        	{
        		System.out.println(i);
        		a[y-1]=i;
        		y++;
        	}
        }/*
        for(i=0;i<p;i++)
        {
            temp=in;
            for(;!(temp.isEmpty());)
            {
                x=(int)temp.peek();
                if(a[i]!=0)
                {
                if(x%a[i]==0)
                {
                    System.out.println(x);
                    in.pop();
                }
                temp.pop();
                }
            }
        }
        for(;!(in.isEmpty());)
        {
            System.out.println(in.peek());
            in.pop();
        }*/
 }
}