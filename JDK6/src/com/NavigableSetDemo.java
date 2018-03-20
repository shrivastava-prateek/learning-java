package com;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet = new TreeSet<Integer>();
		 
		//insert elements
		navigableSet.add(50);
		navigableSet.add(30);
		navigableSet.add(80);
		navigableSet.add(90);
		navigableSet.add(10);
		navigableSet.add(20);
		navigableSet.add(70);
		navigableSet.add(40);
		
		System.out.println(navigableSet);
		
		//traverse in ascending order
		System.out.println("*********Ascending order************");
		for (Integer integer : navigableSet) {
			System.out.println(integer);
		}
		
		//traverse in descending order
		System.out.println("*********Descending order************");
		Iterator<Integer> descendingIterator = navigableSet.descendingIterator();
		while(descendingIterator.hasNext()){
			System.out.println(descendingIterator.next());
		}
		
		//lower() method : returns the greatest element in this set strictly 
		//less than the given element, or null if there is no such element.
		Integer lowerVal = navigableSet.lower(20);
		System.out.println("lower(): " + lowerVal);
		
		//higher() method : returns the least element in this set strictly 
		//greater than 
		//the given element, or null if there is no such element.
		Integer higherVal = navigableSet.higher(80);
		System.out.println("higher(): " + higherVal);
		
		//pollFirst() method : removes the lowest element
		Integer lowest = navigableSet.pollFirst();
		System.out.println("pollFirst(): " + lowest);
		
		//pollLast() method : removes the highest element
		Integer highest = navigableSet.pollLast();
		System.out.println("pollLast(): " + highest);
		
		//ceiling() method : Returns the least element in this set greater than 
		//or equal to the given element, or null if there is no such element.
		Integer ceilingVal = navigableSet.ceiling(60);
		System.out.println("ceiling(): " + ceilingVal);
		
		//floor() method : Returns the greatest element in this set less 
		//than or equal to the given element, or null if there is no such element.
		Integer floorVal = navigableSet.floor(10);
		System.out.println("floor(): " + floorVal);
		
		
		//headSet(Element e) method : Returns a view of the portion of this set 
		//whose elements are strictly less than toElement.
		NavigableSet<Integer> sortedSet = (NavigableSet<Integer>) navigableSet.headSet(60);
		System.out.println("headSet(): " + sortedSet);
		
		//headSet(Element e, boolean inclusive): Returns a view of the portion 
		//of this set whose elements are less than (or equal to, if inclusive 
		//is true) toElement.
		NavigableSet<Integer> set = navigableSet.headSet(70, true);
		System.out.println("headSet(): " + set);
		
		set = navigableSet.headSet(70, false);
		System.out.println("headSet(): " + set);
		
		//subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)  
		//method
		NavigableSet<Integer> subSet1 = navigableSet.subSet(20, true, 70, true);
		System.out.println("subSet(): " + subSet1);
		
		NavigableSet<Integer> subSet2 = navigableSet.subSet(20, false, 70, false);
		System.out.println("subSet(): " + subSet2);
		
		// subSet(E fromElement, E toElement) 
		SortedSet<Integer> subSet3 = navigableSet.subSet(30, 80);
		System.out.println("subSet(): " + subSet3);
		
		//tailSet(E fromElement) 
		SortedSet<Integer> tailSet1 = navigableSet.tailSet(40);
		System.out.println("tailSet(): " + tailSet1);
		
		//tailSet(E fromElement, boolean inclusive)
		SortedSet<Integer> tailSet2 = navigableSet.tailSet(40,true);
		System.out.println("tailSet(): " + tailSet2);
	}
}
