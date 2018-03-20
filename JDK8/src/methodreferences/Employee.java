package methodreferences;

public class Employee {
	   private String name;
	   private Integer age;

	   public Employee()
	   {
	      name = "ABC";
	      age = 20;
	   }

	   public Employee(String name, Integer age)
	   {
	      this.name = name;
	      this.age = age;
	   }

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	   
}
