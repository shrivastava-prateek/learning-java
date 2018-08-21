import java.io.*;
import java.util.Random;


class Sample2
{   
	int a=0;
	String b;
	Sample2()
	{
		a = 15;
		b = "Datia";
	}
	public static void main(String[] args)throws NumberFormatException
	{
		int x,y,z=10;
		//System.out.println(x);//error variable x,y may not have an initialised,
		//int p=q=r=9;//unknown variable q,r
		//System.out.println(a);
		Sample s = new Sample();
		/*String a="";
		 String b=null;
		 //int b = Integer.parseInt(a);
		 if(a=="") 	
		 System.out.println(" a's checking");
		 if(b==null)
		 System.out.println("b's checking");*/
		System.out.println();
		/* System.out.format("The value of 'a' is %d",'a');*/
		Random r =new Random();
		System.out.println(r.nextInt(10));
	}

}
