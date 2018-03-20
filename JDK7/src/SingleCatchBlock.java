public class SingleCatchBlock {
	public static void main(String[] args) {
		int b =10, x[] = { 10, 20, 30 }; 
		try { 
			int c = x[0]/b; 
			System.out.println(c);
			String str = "hello";
			System.out.println(str.charAt(15));
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException 
				| StringIndexOutOfBoundsException  e) { 
			System.out.println(e); 
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}