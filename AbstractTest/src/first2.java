
public class first2 extends first1
{
	public void display1()
	{
		System.out.println("display1()");
		display3();
	}
    public static void main(String[] args)
    {
		System.out.println("first2 main() ");
		first2 a = new first2();
		a.display1();
		display();
    }
    void display3()
    {
		System.out.println("display3()");
    }
}
