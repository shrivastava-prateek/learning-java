import java.io.*;
import java.net.*;
import java.util.*;


class IOsample
{
	public static void main(String args[])throws IOException, URISyntaxException
	{
		/*ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		 URL url = classLoader.getResource("/StudentDetails.txt");
		 File file = new File(url.toURI());
		 System.out.println(file);*/

		//performing varoius functions
		File file= new File("/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/IOSample/StudentDetails.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		System.out.println(file.getPath());
		System.out.println(file.list());

		//forcefully making a relative path (temporary)
		String path = "/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/IOSample/";
		String base = "/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace";
		String relative = new File(base).toURI().relativize(new File(path).toURI()).getPath();
		System.out.println(relative);




        //getting the current working directory
		System.out.println(new File(".").getAbsolutePath());


        //setting the current working directory to a specific directory
		System.out.println("before, the absolute path is :" + new File("").getAbsolutePath());
		System.setProperty("user.dir", "/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace");
		System.out.println("after, the absolute path is :" + new File("IOSample").getAbsolutePath());


		//playing with the current working directory
		File z1= new File("/");
		//failed to create directory
		//System.out.println(z1.mkdir());
		//permission denied
		//System.out.println(z1.createNewFile());
		System.out.println(z1.exists());
		System.out.println(z1.getAbsolutePath());
		/*	List<String> s= new ArrayList<String>();*/
		String s[] = z1.list();
		System.out.println(s);

		for (int i=0;i < s.length;i++)
		{
			System.out.println(s[i]);
			File f=new File("/" + s[i]);
			if (f.isDirectory())
				System.out.println(s[i] + "is a directory");
		}



	}
}
