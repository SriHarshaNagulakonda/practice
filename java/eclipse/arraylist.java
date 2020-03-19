import java.util.*;
public class arraylist {

	public static void main(String args[])
	{
String s;
s.
		int i;
		ArrayList<String> s=new ArrayList<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add(2, "e");
		System.out.println(s.contains("a"));
		s.remove("a");
		for(i=0;i<s.size();i++)
			System.out.println(s.get(i));
System.out.println(s);
		//s.clear();
		//s.(s.getClass());
		Iterator it=s.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(s.size());
		ArrayList<Integer> p=new ArrayList<Integer>();
		p.add(1);
		p.add(2);
		System.out.println(p);
		//int a[]=new int[p.size()];
		//a=p.toArray();
		ListIterator<Integer> lr=p.listIterator();
		while(lr.hasPrevious())
			System.out.println(lr.previous());
		//while(p.hasP)
	}
}
