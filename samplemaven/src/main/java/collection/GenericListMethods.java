package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		//add method
		a.add("green");
		a.add("red");
		a.add("green");
        a.add("black");
        System.out.println(a);
        
        //get method
        
         String s = a.get(2);
         System.out.println(s);
         
         //Set()
         
         a.set(1, "white");
         System.out.println(a);
         
         //indexOf()
         
         System.out.println(a.indexOf("green"));
         
         // LastIndexOf()
         
         System.out.println(a.lastIndexOf("green"));
         
         //remove
         
         a.remove(2);
         System.out.println(a);
         
         //contains()
         
         System.out.println(a.contains("black"));
         
         //isEnpty()
         
         System.out.println(a.isEmpty());
         
         System.out.println(a.size());
         
	}

}
