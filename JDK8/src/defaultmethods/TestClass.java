package defaultmethods;

public class TestClass implements InterfaceA, InterfaceB{
	//This created a compiletime error in the code
	//this error can be resolved by overriding the method in the class
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		InterfaceA.super.method1();
		InterfaceB.super.method1();
	}
	public static void main(String[] args) {
		new TestClass().method1();
	}
}