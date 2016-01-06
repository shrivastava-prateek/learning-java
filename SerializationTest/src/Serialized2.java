
import java.io.*;
public class Serialized2
	{
		public static void main(String[] args)
			{
				try
					{
						File file= new File("/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/SerializationTest/Test.ser");
						FileInputStream fs=new FileInputStream(file);
						ObjectInputStream oi= new ObjectInputStream(fs);

						Serialized sz1=null;
						/*try
						 {	while((sz1=(Serialized)oi.readObject())!=null)
						 System.out.println(sz1);
						 }
						 catch(Exception e)
						 {}*/
						Serialized sz3=(Serialized)oi.readObject();//reading only first object
						System.out.println(sz3.bark.barkSound);//the same value restored and constructor of Bark do not run
						System.out.println(sz3.type+" "+sz3.height);//Dog's contructor runs if Dog is not serializable and vice versa
						System.out.println(sz3.food);//Dog's food value restored if Dog is serializabe otherwise it would be null
						oi.close();
					}
				catch(Exception e)
					{
						System.err.println(e.getMessage());
						/*for (Throwable t:e.getSuppressed ())
						 System.err.println (t);*/
					}
			}
	}
