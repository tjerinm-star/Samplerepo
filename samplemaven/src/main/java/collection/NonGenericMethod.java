package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericMethod {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("apple");
		l.add(32);
		l.add("red");
		//l.add("apple");
		l.add("blue");
		l.add(12);
		//l.add("apple");
		System.out.println(l);//add
		System.out.println(l.get(3));//get
		l.set(2, "black");
		System.out.println(l);//set
		l.remove(2);
		System.out.println(l);//remove
		System.out.println(l.indexOf("apple"));//indexof
		System.out.println(l.lastIndexOf("apple")); // lastindexof()
		System.out.println(l.contains("blue")); //contains
		System.out.println(l.isEmpty());// isEmpty
		System.out.println(l.size());//size

	}

}
