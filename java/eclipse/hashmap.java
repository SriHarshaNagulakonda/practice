
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
       //Map<Integer,String> map=new HashMap<>();
	   Map<Integer, String> map = new HashMap<>();
	   map.put(1,"One");
	   map.put(2,"Two");
	   map.put(1,"onea");
	   System.out.println(map.get(1));
	   System.out.println(map.size());
	   System.out.println(map.containsKey(2));
	   System.out.println(map.containsValue("Two"));
	   //System.out.println(map.remove(1));
	   System.out.println(map.get(1));
	  map.remove(1, "One"
	  		+ ""
	  		+ "");
	  System.out.println(map.get(1));
	}
}