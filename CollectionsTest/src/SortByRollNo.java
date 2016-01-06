
import java.util.*;
public class SortByRollNo implements Comparator<Student> {

		@Override
		public int compare(Student p1,Student p2) {
				return p1.getRollno() - p2.getRollno();
			}


	}
