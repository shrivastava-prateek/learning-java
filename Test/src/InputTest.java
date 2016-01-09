
import java.io.*;
import java.util.*;
public class InputTest
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		InputTest it=new InputTest();
		File f = new File("/ext_card/Files/App Attached/Programs/JAVAworkspace/java/Test/src/Sample.java");
		System.out.println(f.exists());
		Scanner sc=null;
		File f1 = new File("/ext_card/Files/App Attached/Programs/JAVAworkspace/java/Test/src/Sample2.java");
		System.out.println(f1.exists());
		RandomAccessFile file =new RandomAccessFile(f1,"rw");
		Scanner sc1=null;
		try
		{
			sc = new Scanner(f);
			sc1 = new Scanner(f1);
		}
		catch (FileNotFoundException e)
		{}
		while (sc.hasNext())
		{
			//	System.out.println(sc.nextLine());
			String a=sc.nextLine();
			a=a.replaceAll("\\s+","");
		    String b=file.readLine();
			b=b.replaceAll("\\s+","");
			if(a==""&&b=="")continue;
			System.out.println(a);
			//System.out.println(a.indexOf("\\n")+" "+b.indexOf("\\n"));
			
			//String s=it.trimming(a);
			//System.out.println(s);
			//String s1=it.trimming(b);
			//System.out.println(s1);
			boolean flag=false;
		if (a.equalsIgnoreCase(b))
		{
				continue;
			}
			else
			{
				String s2=null;
				while (sc1.hasNext())
				{
					s2=sc1.nextLine().replaceAll("\\s+","");
					if(s2=="")continue;
					if (a.equalsIgnoreCase(s2))
					{
						flag = true;
						break;
					}
				}
				if(flag==true){
					while(!(b.equalsIgnoreCase(s2))){
						file.write(b+" Yellow "
					}
				}

			}
		}
	}
//	String trimming(String s)
//	{
//		String s1=new String();
//		for (char a:s.toCharArray())
//		{
//			if (a != ' ')
//			{
//				s1 = s1 + a;
//			}
//		}
//		return s1;
//	}
}
