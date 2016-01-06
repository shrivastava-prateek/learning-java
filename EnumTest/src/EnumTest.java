public class EnumTest
	{
		public static void main(String[] args)
			{
				//Size si=new Size();//Error as constructor is private;
				//Size siz=new Size(8);//Error , enum object can not be created

				for(Size s:Size.values())
					{
						System.out.print(s+" ");
					}
				System.out.println();
				for(Size s:Size.values())
					{
						System.out.print(s+" "+s.getValue()+" ");
					}
				Size s=Size.MEDIUM;
				assert(s==Size.MEDIUM):"yes"+Size.MEDIUM;//Ignored by JVM as assertions are disabled by default
				System.out.println();
				System.out.println(s.ordinal());
				System.out.println(s.getClass()+" "+s.getDeclaringClass()+" "+s.hashCode()+" "+s.LARGE+" "+s.name()+" "+s.s+" "+s.toString()+" "+s.value+" "+s.valueOf("SHORT")+" "+s.values()+" "+s);

				System.out.println(s.getColor()+" ");
				System.out.println(Size.SHORT.getColor()+" ");
				System.out.println(Size.LARGE.getColor());
				//System.out.println(Size.main(8));
				s.SHORT.setLength(5);
				System.out.println(s.SHORT.getLength());
				
		//	System.out.println(Size.main());
				//	System.out.println(Size.SHORT.main());//void method can not be invoked by enum type
			}
	}
