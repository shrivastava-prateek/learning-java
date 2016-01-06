package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(40);
		s.add(30);
		s.add(70);
		s.add(20);
		
		System.out.println("Size: " + s.size());
		System.out.println("HashSet: " + s);
		
		int sum = 0;
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()){
			sum += itr.next();
		}
		System.out.println("Sum: " + sum);
		sum = 0;
		for (Integer integer : s) {
			sum += integer;
		}
		System.out.println("Sum: " + sum);
		s = new LinkedHashSet<Integer>();
		s.add(40);
		s.add(30);
		s.add(70);
		s.add(20);
		System.out.println("Size: " + s.size());
		System.out.println("LinkedHashSet: " + s);
		
		s = new TreeSet<Integer>();
		s.add(40);
		s.add(30);
		s.add(70);
		s.add(20);
		System.out.println("Size: " + s.size());
		System.out.println("TreeSet: " + s);
	}
}
 