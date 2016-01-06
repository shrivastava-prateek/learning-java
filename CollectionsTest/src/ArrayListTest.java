
import java.util.*;
public class ArrayListTest {
		public static void main(String[] args) {
				Student[] s= Test.initialization();
				List<Student> list= Arrays.asList(s);
				System.out.println("List before sorting");
				System.out.println(list);
				System.out.println("After sorting(by name):");
				Collections.sort(list);
				System.out.println(list);
				System.out.println("Sorted by roll no:");
				Collections.sort(list,new SortByRollNo());
				System.out.println(list);
			}
	}
