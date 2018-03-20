public class ExceptionDemo {
	public static void main(String[] args) {
		int a,b,c;
		a = 10;
		b = 2;
		try{
			c = a/b;
			System.out.println("c is: " + c);
			
			int arr[] = new int[3];
			System.out.println(arr[2]);
			
			String str = "hello";
			System.out.println(str.charAt(15));
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
