
import java.util.*;
import java.io.*;
public class EmployeeManagement
	{
		public static void main(String[] args)throws IOException
			{
				ArrayList<Employee> emp=new ArrayList<>();
				//Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the no. of employees");
				//int n=sc.nextInt();
				int n=Integer.parseInt(br.readLine());
				for(int i=0;i<n;i++)
					{
						System.out.println();
						System.out.println("Enter the employee id of "+(i+1)+" Employee");
						String id=br.readLine();
						System.out.println();
						System.out.println("Enter the employee name of "+(i+1)+" Employee");
						String name=br.readLine();
						System.out.println();
						System.out.println("Enter the no. of days worked of "+(i+1)+" Employee");
						int noOfDays=Integer.parseInt(br.readLine());
						System.out.println();
						System.out.println("Enter the employee type of "+(i+1)+" Employee");
						String type=br.readLine();
						System.out.println();
						Employee e=new Employee(id,name,noOfDays,type);
						emp.add(e);

					}
				Project p=new Project("MyProject",0,emp);
				Contract c=new Contract();
				int contractBill=	c.generatebillingrate(p);
				System.out.println(contractBill);
				Permanent perm=new Permanent();
				int permBill=perm.generatebillingrate(p);
				System.out.println(permBill);
				System.out.println("The total bill of "+p.getProjectname()+" is : "+(contractBill+permBill));


			}
	}
