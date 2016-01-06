public class Singleton
{
	private static Singleton obj= new Singleton();
	private Singleton()
	{
// A class with private constructor can not be subclassed
	}
	public static Singleton getInstance()
	{
		return obj;
	}
}
