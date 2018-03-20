package methodreferences;

public class ConstructorRefDemo {
	   public static void main(String[] args)
	   {
	      EmployeeProvider1 provider1 = Employee::new;
	      Employee emp1 = provider1.getEmployee("XYZ",30);
	      System.out.println(emp1.getName());
	      System.out.println(emp1.getAge());
	      
	      EmployeeProvider2 provider2 = Employee::new;
	      Employee emp2 = provider2.getEmployee();
	      System.out.println(emp2.getName());
	      System.out.println(emp2.getAge());
	   }
}