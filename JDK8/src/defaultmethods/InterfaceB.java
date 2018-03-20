package defaultmethods;

public interface InterfaceB {
	public default void method1(){
		System.out.println("Method1 of InterfaceB");
	}
}
