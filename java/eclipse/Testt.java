import java.util.*;
import java.lang.*;
class Testt
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        Arrays.sort(a);
        int min=a[k-1]-a[0];
        for(int i=1;i<n-k;i++)
        {
        	if(min>a[k+i-1]-a[i])
        		min=a[k+i-1]-a[i];
        }
        System.out.println(min);
        
    }
}