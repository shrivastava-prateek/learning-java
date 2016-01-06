import java.util.*;

public class Main extends SuperClass
{

	@Override
	public void display2()
	{
		System.out.println("display2 of SuperClass implemented in base class");
	}

	public void baseDisplay()
	{
		System.out.println("baseDisplay of base class");
	}

	@Override
	public void display3()
	{
		//super.display3();
		System.out.println("display3 of base class");
	}


	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		SuperClass sc= new Main();
		sc.display1();
		sc.display2();
		sc.display3();
		//sc.baseDisplay();not able to call it 
		//because it is not defined or declared in SuperClass



	}
}
