public class StringTest
	{
		public static void main(String[] args)
			{
				String a=null;
				String b="";
				String c="";
				String d=null;
				String e=" ";
				String f="a";
				String g="a";
				String h="a,,,";
				String j="a,,,h";
				String[] i=h.split(",");//length is 1
				String[] k=j.split(",");//length is 4, k[1]&k[2] is ""
				//NullPointerException
				//System.out.println(a+".and."+b+" "+a.equals(b));
				//System.out.println(a+".and."+d+" "+a.equals(d));
				System.out.println(b+".and."+c+" "+b.equals(c));
				System.out.println(b+".and."+c+" "+b==c);
				System.out.println("Length of an array "+i.length);
				System.out.println("Length of an array "+k.length);
				//System.out.println(i[0]+".and."+i[1]+".and.");
				System.out.println(k[0]+".and."+k[1]+".and."+k[2]+".and."+k[3]);
				System.out.println(f+".and."+g+" "+f.equals(g));
				System.out.println(f+".and."+g+" "+f==g);
				
				StringBuffer sb=new StringBuffer();
				sb.append("hey ").append("\n").append("this is me");
				System.out.println(sb);
			}
	}
