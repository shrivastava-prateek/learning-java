package methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonStaticMethodReferenceDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Ramlal", 36));
		persons.add(new Person("Laxman", 20));
		persons.add(new Person("Vijay", 25));
		persons.add(new Person("Aman", 45));
		persons.add(new Person("Saket", 14));
		System.out.println("Before sorting:");
		for (Person person : persons) {
			System.out.println(person);
		}
		System.out.println("*****************************************");
		
		Collections.sort(persons, Person::sortByAge);
		System.out.println("After sorting by age:");
		for (Person person : persons) {
			System.out.println(person);
		}
		System.out.println("*****************************************");
		
		Collections.sort(persons, Person::sortByName);
		System.out.println("After sorting by name:");
		for (Person person : persons) {
			System.out.println(person);
		}
		System.out.println("*****************************************");
	}

}
