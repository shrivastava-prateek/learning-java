package com;

public class LambdaUsage{

	public static void main(String[] args) {
		
       Greetings greetings = new GreetingsImpl();
       greetings.greet("World");
       
       //if you need to change definition of greet method, you will have to write another class.
       
       //one parameter without parenthesis
       Greetings greet1 = x -> System.out.println("Hello "+x);
       
       //one parameter with parenthesis
       Greetings greet2= (String name)-> {System.out.println("Welcome "+name);};
       
       greet1.greet("Mr. Wayne");
       greet2.greet("Mr. X");
       
       
       Greetings g = x -> {System.out.println("Beware "+x+" , Storm is coming");};
       g.greet("Mr. Wayne");
       
       
       //when function do not take any parameter , we have to write empty parenthesis
       Animal cat = ()->System.out.println("Meow");
       Animal dog = ()->System.out.println("Bark");
       Animal lion = ()->System.out.println("Roar");
       
       cat.speak();
       dog.speak();
       lion.speak();
       
       
       //lambda for a function returning a value
       //with specifying data type for  variables
       Operations add=(int a, int b)-> a+b;
       
       //without specifying data type for variables
       Operations sub = (a,b) -> a-b;
       
       //return statement with curly braces
       //semicolon required at both locations
       Operations multi = (a,b)-> {return a*b;};
       
       //return statement without curly braces
       Operations div= (a,b)-> a/b;
       
       System.out.println(add.operations(10, 20));
       System.out.println(sub.operations(40, 5));
       System.out.println(multi.operations(12, 10));
       System.out.println(div.operations(60, 10));
       
       
       
	}


}
