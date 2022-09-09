package methodrefpack;

import java.util.ArrayList;
import java.util.List;

public class ReferenceImpl {
	public void myMethod() {
		System.out.println("In a method");
	}
	
	public void listDemo() {
		List<String> names = new ArrayList<String>();
		names.add("Prithvi");
		names.add("Nyra");
		names.add("Sanav");
		names.add("Kanchan");
		names.add("Rohan");
		
//		for(String s: names) {
//			System.out.println(s);
//		}
		
//		names.forEach(s -> System.out.println(s));
		names.forEach(System.out::println);
		
	}
}
