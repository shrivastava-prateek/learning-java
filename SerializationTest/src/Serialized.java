
import java.io.*;
public class Serialized extends Dog implements Serializable
	{
		private int a;
		private int b;
		private int c;
		private String s;
		Bark bark=new Bark();


		public static final long serialVersionUID= -12345678L;

		Serialized(int a,int b,int c,String s)
			{

				this.a=a;
				this.b=b;
				this.c=c;
				this.s=s;
				System.out.println("Serialized's constructor");
			}
		public int getA()
			{
				return a;
			}
		public int getB()
			{
				return b;
			}
		public int getC()
			{
				return c;
			}
		public String getS()
			{
				return s;
			}

		@Override
		public String toString()
			{
				return a+" "+b+" "+c+" "+s+" "+type+" "+height+" ";
			}

		public static void main(String[] args)
			{
				Serialized[] sz=new Serialized[3];
				sz[0]=new Serialized(1,2,3,"object1");
				sz[1]=new Serialized(4,5,6,"object2");
				sz[2]=new Serialized(7,8,9,"object3");
				sz[0].setFood();
				System.out.println(sz[0].food);


				try
					{
						File file= new File("/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/SerializationTest/Test.ser");
						FileOutputStream fs= new FileOutputStream(file);
						ObjectOutputStream os= new ObjectOutputStream(fs);
						for(Serialized szs:sz)
							os.writeObject(szs);
						os.close();

						System.out.println("Serialization completed");
					}
				catch(Exception e)
					{
						System.err.println(e);
						/*for ( Throwable t:e.getSuppressed () )
						 System.err.println (t);*/
					}

			}

	}
