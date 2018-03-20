package com;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(456, "Charita");
		map.put(145, "Akshay");
		map.put(642, "Nitin");
		map.put(453, "Pradnya");
		map.put(234, "Shital");
		map.put(897, "Sagar");
		
		System.out.println("Contents: " + map);
		
		//ceilingKey(Key key)
		Integer key = map.ceilingKey(100);
		System.out.println(key);
		
		//descendingKeySet()
		System.out.println("******Keys in reverse order*********");
		NavigableSet<Integer> keys = map.descendingKeySet();
		for (Integer integer : keys) {
			System.out.println(integer);
		}
		
		//descendingMap()
		System.out.println("*********Map in reverese order**********");
		NavigableMap<Integer, String> descMap = map.descendingMap();
		System.out.println(descMap);
		
		//headMap(K toKey) 
		System.out.println("*********Head Map**********");
		SortedMap<Integer, String> head = map.headMap(400);
		System.out.println(head);
		
		//headMap(K toKey, boolean inclusive)
		System.out.println("*********Head Map inclusive**********");
		NavigableMap<Integer, String> navigableHead = map.headMap(453 , true);
		System.out.println(navigableHead);
		
		//tailMap(K fromKey) 
		System.out.println("*********Tail Map**********");
		SortedMap<Integer, String> sortedTail = map.tailMap(453);
		System.out.println(sortedTail);
		
		//tailMap(K fromKey, boolean inclusive)
		System.out.println("*********Tail Map**********");
		NavigableMap<Integer, String> navigatedTail = map.tailMap(453,true);
		System.out.println(navigatedTail);
	}
}
