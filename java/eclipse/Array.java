
public class Array {

	public static void main(String args[]) {
		int a[],i,s=0;
		a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
        System.out.println("Array Length="+a.length);
		for(i=0;i<3;i++)
		{
			s=s+a[i];
			System.out.print(a[i]+"\n");
		}
		System.out.println("Sum="+s);
	}
}
