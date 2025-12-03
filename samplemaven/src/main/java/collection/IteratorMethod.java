package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethod {

	public static void main(String[] args) {
	Set <String> s = new HashSet<String>();
	s.add("red");
	s.add("black");
	s.add("blue");
	
	Iterator it =s.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	it.remove();
	System.out.println(s);

	}

}
