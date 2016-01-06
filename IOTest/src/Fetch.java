import java.io.*;
import java.util.*;

public class Fetch
	{
		public static void main(String[] args)throws Exception
			{
				/*try(Reader br = new BufferedReader(new FileReader("/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/IOTest/TestFile.txt")){
				 System.out.println(br.readLine());
				 }*/
				String fileName= "/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/IOTest/TestFile.txt";
				//BufferedReader reader1= null;
				System.out.println("Reading with BufferedReader");
				File file=new File(fileName);
				int i=0;
				try (BufferedReader reader = new BufferedReader(new FileReader(file))) { 
						String s=null;
						while((s=reader.readLine())!=null)
							{
								i++;
								System.out.println("Line no. "+i+" "+s);
							}
					}
				System.out.println("Reading with Scanner ");
				Scanner sc =new Scanner(file);
				i=0;
				while(sc.hasNext())
					{
						i++;
						System.out.println("Line no. "+i+" "+sc.nextLine());
					}
			}



		/*BufferedReader br = new BufferedReader(new FileReader("/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/IOTest/TestFile.txt"));
		 String line= null;
		 while ((line = br.readLine()) != null)
		 {
		 System.out.println(line);
		 }
		 br.close();
		 System.out.println();*/



	}
