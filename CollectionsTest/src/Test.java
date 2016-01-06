
import java.util.*;
public class Test {
		public static void main(String[] args) {
				Student s2[]= initialization();
				System.out.println(s2[0].equals(s2[1]));
				System.out.println(s2[1].equals(s2[2]));
				System.out.println(s2[1].equals(s2[0]));
				System.out.println(s2[0] == s2[1]);
				System.out.println(s2[0].hashCode());
				System.out.println(s2[1].hashCode());
				System.out.println(s2[2].hashCode());

			}
		public static Student[] initialization() {
				Student s[]=new Student[5];
				s[0]=new Student(1,"Student1",5,"Basic");
				s[1]=new Student(1,"Student1",5,"Basic");
				s[2]=new Student(19,"Student2",9,"Basic");
				s[3]=new Student(63,"Student3",10,"Higher");
				s[4]=new Student(17,"Student4",12,"Intermediate");
				return s;
			}
	}
