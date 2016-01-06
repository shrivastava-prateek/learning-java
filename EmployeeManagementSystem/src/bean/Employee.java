public class Employee
	{
		String employeeId;
		String employeeName;
		int noOfDaysWorked;
		String employeeType;

		public Employee(String employeeId,String employeeName,int noOfDaysWorked,
			String employeeType)
			{
				super();
				this.employeeId=employeeId;
				this.employeeName=employeeName;
				this.noOfDaysWorked=noOfDaysWorked;
				this.employeeType=employeeType;
			}
		public String getEmployeeId()
			{
				return employeeId;
			}
		public void setEmployeeId(String employeeId)
			{
				this.employeeId=employeeId;
			}
		public String getEmployeeName()
			{
				return employeeName;
			}
		public void setEmployeeName(String employeeName)
			{
				this.employeeName=employeeName;
			}
		public int getNoOfDaysWorked()
			{
				return noOfDaysWorked;
			}
		public void setNoOfDaysWorked(int noOfDaysWorked)
			{
				this.noOfDaysWorked=noOfDaysWorked;
			}
		public String getEmployeeType()
			{
				return employeeType;
			}
		public void setEmployeeType(String employeeType)
			{
				this.employeeType=employeeType;
			}



	}
