
import java.io.*;
public class Dog implements Serializable
	{ 
		String type ;
		int height;
		String food;

		public Dog()
			{
				this.type="German";
				this.height=2;
				System.out.println("Dog's constructor");
			}

		public void setFood()
			{
				this.food="veg";
			}
	}
