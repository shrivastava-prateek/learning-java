
import java.util.*;
public class TreeSetTest {
		public static void main(String[] args) {
				Set <Student> tset= new TreeSet<>();
				Student[] s= Test.initialization();
				List<Student> s2= Arrays.asList(s);
				tset.addAll(s2);
				for(Student s3:tset) {
						System.out.println(s3);
					}
			}
	}
