package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> a = new HashSet<String>();
		a.add("apple");
		a.add("grapes");
		a.add("mango");// add
		Set <String> b = new HashSet<String>();
		b.add("orange");
		b.add("kiwi");
		b.add("dragonfruit");
		//add
		System.out.println(a);
		//addAll
		a.addAll(b);
		System.out.println(a); 
		//containsAll()
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		//isEmpty()
		System.out.println(a.isEmpty());
		//remove
		a.remove("mango");
		System.out.println(a);
	   // removeAll()
		a.removeAll(b);
		System.out.println(a);
		//size()
		System.out.println(b.size());
		//clear()
		a.clear();
		System.out.println(a);

	}

}
