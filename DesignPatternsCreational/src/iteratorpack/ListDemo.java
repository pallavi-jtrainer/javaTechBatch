package iteratorpack;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public void listDemoMethod() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(21);
		numbers.add(23);
		numbers.add(1);
		numbers.add(34);
		numbers.add(22);
		numbers.add(3);
		
		System.out.println(numbers);
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		for(Integer i: numbers) {
			System.out.println(i);
		}
		
		Iterator<Integer> itr = numbers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
