
public class MyList<T> {



		int index=-1,icheck=-1,iget=-1;
		Listings<T> l=null;
		Listings<T> temp;


		
		public boolean hasNext() {
				if(icheck > -1) {
						icheck--;
						return true;}
				else return false;
			}

	
		public T next() {
				iget++;
				return get(iget);
			}

		
		public void remove() {
				// TODO: Implement this method
			}


		public void add(T a) {
				index++;
				temp=new Listings<T>(l,a,index);
				l=temp;
				icheck=index;
			}

		public T get(int i) {
				temp=l;
				while(temp != null) {
						if(temp.index == i)
							return temp.data;
						else
							temp=temp.l;
					}
				return null;
			}
			
		public int size() {
				return index + 1;
			}




	}
