package methodreferences;

public interface EmployeeProvider1 {
	Employee getEmployee(String name,Integer age);
}

/*class EmployeeProvider1Class implements EmployeeProvider1{

	@Override
	public Employee getEmployee(String name, Integer age) {
		Employee employee = new Employee(name, age);
		return employee;
	}
	
}*/