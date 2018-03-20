package defaultmethods;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("BONE");
	}

	@Override
	public void speak() {
		System.out.println("BARK");
	}

}
