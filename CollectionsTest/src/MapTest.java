
import java.util.*;
public class MapTest {
		//HashMap uses hashCode() values as a key to the value.
		//and uses equals() and hashCode() for checking duplicate keys
		public static void main(String[] args) {
				Student[] s= Test.initialization();
				Map<Student,Integer>map=new HashMap<>();
				System.out.println("Putting keys=values in a map");
				map.put(s[0],1);
				map.put(s[1],2);//overwriting the value from 1 to 2
				map.put(s[2],3);
				map.put(s[3],4);
				map.put(s[4],5);

				System.out.println(map);
				System.out.println("Size of the Map : " + map.size());
				System.out.println(map.get(s[0]));
				System.out.println(map.get(s[1]));//printing the same as above
				System.out.println(map.get(s[2]));
				System.out.println(map.get(s[3]));
				System.out.println(map.get(s[4]));

			}
	}
