public class Digits { 
	public static void main(String args[]) { 
		int carCost = 48_87_653;   
		float busCost = 16_47_812.2_567f; 
		
		System.out.println("Car cost Rs. " + carCost); 
		System.out.println("Bus cost Rs. " + busCost); 
		
		//following statements will cause compile time error
		//carCost = _23456;
		//carCost = 234567_;
		//carCost = 1234_.89;
		//carCost = 2345._90;
		//busCost = 2345678.90_f;
		
		String num = "1_23_345";
		Integer.parseInt(num);

	} 
} 