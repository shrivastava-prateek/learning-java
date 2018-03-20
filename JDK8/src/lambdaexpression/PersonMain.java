package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain {
	public static void main(String[] args) {
		Comparator<Person> byName = 
				(Person p1, Person p2)->p1.getName().compareTo(p2.getName());
				
				Person p1 = new Person("XYZ", 12);
				Person p2 = new Person("ABC", 20);
				Person p3 = new Person("LMN", 15);
				
				List<Person> persons = new ArrayList<>();
				persons.add(p1);
				persons.add(p2);
				persons.add(p3);
				System.out.println("***********Before sorting*********");
				System.out.println(persons);
				Collections.sort(persons, byName);
				System.out.println("***********After sorting*********");
				System.out.println(persons);
				
				Set<Person> set = new TreeSet<Person>(byName);
				set.add(p1);
				set.add(p2);
				set.add(p3);
				System.out.println("***********TreeSet*********");
				System.out.println(set);
	}
}
