public class circle
{
	public float x,y,z;
	public circle(int a,int b,int c)
	{
	   x=a;
	   y=b;
	   z=c;
	}
	public circle(int r)
	{
		x=1;
		y=1;
		z=r;
	}
	public circle()
	{
		x=0;
		y=0;
		z=1;
	}
	public double circum()
	{
		return 2*3.14*z;
	}
	public static void main(String[] args)
	{
		circle acircle=new circle();
		circle bcircle=new circle(5);
		circle ccircle=new circle(2,3,5);
		System.out.println(acircle.circum());
		System.out.println(bcircle.circum());
		System.out.println(ccircle.circum());
	}
}
