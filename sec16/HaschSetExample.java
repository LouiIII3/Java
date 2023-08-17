package sec16.exam01;
import java.util.*;


public class HaschSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Python");
		set.add("Spring");
		set.add("SQL");
		set.add("Java");
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
	}

}
