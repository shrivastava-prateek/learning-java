package defaultmethods;

public class DefaultMethodTestMain {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.eat();
		animal.speak();
		animal.legs("Cat");
		
		animal = new Dog();
		animal.eat();
		animal.speak();
		animal.legs("Dog");
		
		animal = new Bird();
		animal.eat();
		animal.speak();
		animal.legs("Sparrow");
	}
}
