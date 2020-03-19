import java.util.*;
class Student
{
	int x,y,z;
	/*void get(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}*/
}
public class ArrayListUsingClass {
	public static void main(String args[])
	{
		Student a=new Student();
		Student b=new Student();
		Student c=new Student();
		a.x=1;
		a.y=2;
		a.z=3;
		b.x=1;
		b.y=2;
		b.z=3;
		c.x=1;
		c.y=2;
		c.z=3;
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(a);
		s.add(b);
		s.add(c);
		int i;
	for(i=0;i<=2;i++)
		System.out.println(s.get(i));
	
	}
}
