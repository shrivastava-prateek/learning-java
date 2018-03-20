package methodreferences;

public class ConstructorReferenceDemoArray {
	public static void main(String[] args) {
		ArrayFunctionInterface functionInterface = int[] :: new;
		
		int intArr1[] = functionInterface.intArrMaker(5);
		int intArr2[] = functionInterface.intArrMaker(8);
		int intArr3[] = functionInterface.intArrMaker(10);
		
		for (int i = 0; i < intArr1.length; i++) {
			intArr1[i] = i * 10;
		}
		
		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i] = i * 5;
		}
		
		for (int i = 0; i < intArr3.length; i++) {
			intArr1[i] = i * 2;
		}
	}
}
