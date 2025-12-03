package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
	
		Set s = new HashSet();
		s.add("red");
		s.add("yellow");
		s.add("black");
		s.add(32);
		Set p = new HashSet();
		p.add("blue");
		p.add(8);
		p.add("pink");
		p.add("gray");
		// add()
		System.out.println(s);
		//addAll()
		s.addAll(p);
		System.out.println(s);
		//contains()
		System.out.println(s.contains("black"));
		//containsAll()
		System.out.println(s.containsAll(p));
		System.out.println(p.containsAll(s));
		//isEmpty()
		System.out.println(s.isEmpty());
		//remove
		s.remove(32);
		System.out.println(s);
		//removeAll()
		s.removeAll(p);
		System.out.println(s);
		//size()
		System.out.println(s.size());
		//clear
		s.clear();
		System.out.println(s);

	}

}
