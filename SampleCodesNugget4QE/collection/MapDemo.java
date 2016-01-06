package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(110, "abc");
		m.put(345, "xyz");
		m.put(897, "pqr");
		m.put(999, "abc");
		//m.put(110, "ccc");
		System.out.println(m);
		
		Set<Integer> keys = m.keySet();
		for (Integer integer : keys) {
			System.out.println(integer);
			String val = m.get(integer);
			System.out.println(val);
		}
		
		Collection<String> val = m.values();
		for (String string : val) {
			System.out.println(string);
		}
	}

}
