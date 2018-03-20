package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PublicInstanceMethodReference {

	public static void main(String[] args) {

		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Bruce",36,"Gotham"));
		persons.add(new Person("Clark",40,"New York City"));
		persons.add(new Person("Flash",28,"Central City"));
		persons.add(new Person("Arrow",35,"Starling City"));
		persons.add(new Person("Super Girl",30,"National City"));
		System.out.println("Before sorting :");
		for(Person p:persons){
			System.out.println(p);
		}
		
		System.out.println("-------------------------------------------------------------------");
		Person p=new Person();
		//sort(list.comparator);
		//Collections.sort(persons,new AgeComparator());
		
		Collections.sort(persons,p::compareByAge);
		System.out.println("Compare by age :");
		for(Person p1:persons){
			System.out.println(p1);
		}
		System.out.println("-------------------------------------------------------------------");
		Collections.sort(persons, p::compareByName);
		System.out.println("Compare by Name: ");
		for(Person p1:persons){
			System.out.println(p1);
		}
		System.out.println("-------------------------------------------------------------------");
       Collections.sort(persons,Person::compareByCity);
       for(Person p2:persons){
    	   System.out.println(p2);
       }
	}

}
