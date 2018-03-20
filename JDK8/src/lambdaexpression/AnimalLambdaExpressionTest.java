package lambdaexpression;

public class AnimalLambdaExpressionTest {
	public static void main(String[] args) {
		//Animal cat1 = new Cat();
		//cat1.speak();
		
		//with no parameters
		Animal cat = () -> System.out.println("MEAW");
		
		Animal dog = () -> System.out.println("BARK");
		
		Animal lion = () -> System.out.println("ROAR");
		
		cat.speak();
		dog.speak();
		lion.speak();
	}
}
/*class Cat implements Animal{
	@Override
	public void speak() {
		System.out.println("MEAW");		
	}
}*/