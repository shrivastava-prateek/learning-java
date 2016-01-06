
import java.util.*;
public class HashSetTest {
		//HashSet uses hashCode() for storing and retreiving the elements.
		//and hence uses in searching too.
		public static void main(String[] args) {
				Student[] s= Test.initialization();
				Set<Student>set = new HashSet<>();
				set.add(s[0]);
				set.add(s[1]);
				set.add(s[2]);
				set.add(s[3]);
				set.add(s[4]);
				System.out.println(set);
				System.out.println("Size of the set : " + set.size());

				for(Student i:set)
					System.out.println(i);

				System.out.println(set.contains(s[0]));

			}
	}
