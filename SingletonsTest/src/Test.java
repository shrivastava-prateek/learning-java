public class Test
{
	public static void main(String[] args)
	{
		Singleton obj=Singleton.getInstance();
		System.out.println(obj.hashCode());
		obj = Singleton.getInstance();
		System.out.println(obj.hashCode());
	}
}
