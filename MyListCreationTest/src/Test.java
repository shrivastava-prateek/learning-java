

public class Test {
		public static void main(String[] args) {
				MyList<String> list= new MyList<>();
				list.add("One");
				list.add("Two");
				list.add("Three");
				list.add("Four");
				System.out.println("String list size : " + list.size());

				while(list.hasNext()) {
						System.out.println(list.next());
					}
				MyList<Integer> nlist= new MyList<>();
				nlist.add(1);
				nlist.add(2);
				nlist.add(3);
				nlist.add(4);
				System.out.println("integer list size : " + nlist.size());

				while(nlist.hasNext()) {
						System.out.println(nlist.next());
					}


			}
	}
