
import java.util.*;
public class RootsCalculation
	{
		public static void main( String []args )
			{
				System.out.println ("Enter the value a,b,c");
				Scanner sc = new Scanner (System.in);
				int a=sc.nextInt ();
				int b=sc.nextInt ();
				int c= sc.nextInt ();
				double t = b * b - 4 * a * c;
				if (t > 0)
					System.out.println ("\n Roots are real and unequal");
				if (t == 0)
					System.out.println ("Roots are real and equal");
				if (t < 0)
					System.out.println ("Roots are imaginary");
				double x1=( -b + ( Math.sqrt (t) ) ) / ( 2 * a );
				double x2=( -b - ( Math.sqrt (t) ) ) / ( 2 * a );
				System.out.println ("1st root =" + x1 + "  Second root= " + x2);
			}
	}
