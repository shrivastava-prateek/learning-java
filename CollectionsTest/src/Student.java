public class Student implements Comparable<Student> {

		@Override
		public int compareTo(Student p1) {
				return (this.name).compareTo(p1.name);
			}

		private int rollno;
		private String name;
		private int standard;
		private String stream;

		Student(int rollno,String name,int standard ,String stream) {
				this.rollno=rollno;
				this.name=name;
				this.standard=standard;
				this.stream=stream;
			}

		public void setStream(String stream) {
				this.stream=stream;
			}

		public String getStream() {
				return stream;
			}

		public void setName(String name) {
				this.name=name;
			}

		public String getName() {
				return name;
			}

		public void setRollno(int rollno) {
				this.rollno=rollno;
			}

		public int getRollno() {
				return rollno;
			}

		public void setStandard(int standard) {
				this.standard=standard;
			}

		public int getStandard() {
				return standard;
			}

		@Override
		public String toString() {

				return rollno + " " + name + " " + standard + " " + stream;
			}

		@Override
		public boolean equals(Object o) {
				if(this == o)return true;
				if(o != null && o.getClass() != this.getClass())
					return false;
				Student s=(Student)o;
				return this.rollno == s.getRollno() && this.name.equals(s.getName()) && this.standard == s.getStandard() && this.stream.equals(s.getStream());
			}

		@Override
		public int hashCode() {
				int hash=31;
				System.out.println("Name : " + this.name);
				hash=89 * hash + (this.rollno ^ 32);
				hash=89 * hash + ((this.name != null) ?this.name.hashCode(): 0);
				System.out.println(hash);
				hash=89 * hash + (this.standard);
				System.out.println(hash);
				hash=89 * hash + ((this.stream != null) ?this.stream.hashCode(): 0);
				System.out.println(hash);
				return hash;
			}




	}
