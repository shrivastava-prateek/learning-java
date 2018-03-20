package lambdaexpression;

public class OperationsLambdaExpressionTest {
	public static void main(String[] args) {
		
		//with specifying data types for variables
		Operations addition = (int a, int b) -> a+b;
		
		//without specifying data types for variables
		Operations subtraction = (a , b) -> a-b;
		
		//return statement with curly braces
		Operations multiplication = (int a, int b) -> {return a*b;}; 
		//semicolon required at both locations
		
		//return statement without curly braces
		Operations division = (a, b) ->  a/b;
		
		System.out.println(addition.operation(10, 20));
		System.out.println(subtraction.operation(40, 5));
		System.out.println(multiplication.operation(12, 10));
		System.out.println(division.operation(60, 10));
		
		
		
		
		
		
		/*try{
			System.out.println(division.operation(60, 0));
		}catch(ArithmeticException e){
			System.out.println("Divide by 0 operation not supported");
		}*/
	}
}
