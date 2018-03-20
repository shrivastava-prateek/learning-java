package lambdaexpression;
/*
 * Lambda expression eliminates the need of defining a class that implements Greetings interface
 * we can have multiple statements in lambda expression
 */
public class GreetingsLambdaExpressionTest {
	public static void main(String[] args) {
		//Greetings greetings = new GreetingsImpl();
		//greetings.greet("World");
		
		//one parameter without parenthesis
		Greetings greet1 = name -> {
										System.out.println("Hello " + name); 
										System.out.println("Hello");
									};
		
				
		//one parameter with parenthesis
		Greetings greet2 = (String name) -> System.out.println("Welcome " + name);
		
		greet1.greet("World");
		greet2.greet("World");
	}
}
