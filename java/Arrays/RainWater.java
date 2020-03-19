//Question23-Trapping rain water problem
import java.util.Scanner;

public class RainWater {

	//taking no. of zeroes between 2 non-zero elements as length of the tank, height as the minimum value of  2 adjacent non-zero elements
	//multiplying height and length of all those and adding them
	
	static int getArea(int a[])
	{
		int s=0;
		int n=a.length;
		int i,y=0,x=0,j=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				y=a[i];
				j=i;
				break;
			}
		}
		for(i=j;i<n;i++)
		{
			if(a[i]==0)
				x++;
			else
			{
				s+=x*Math.min(y,a[i]);
				y=a[i];
				x=0;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(getArea(a));

	}

}
