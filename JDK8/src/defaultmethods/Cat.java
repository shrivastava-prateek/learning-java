package defaultmethods;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("MILK");
	}

	@Override
	public void speak() {
		System.out.println("MEOW");
	}
}
