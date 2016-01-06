
import java.util.ArrayList;


public class Project
	{
		String projectname;
		float billingrate;
		ArrayList<Employee> emp=new ArrayList<Employee>();

		public Project(String projectname,float billingrate,
            ArrayList<Employee> emp)
			{
				super();
				this.projectname=projectname;
				this.billingrate=billingrate;
				this.emp=emp;
			}
		public String getProjectname()
			{
				return projectname;
			}
		public void setProjectname(String projectname)
			{
				this.projectname=projectname;
			}
		public float getBillingrate()
			{
				return billingrate;
			}
		public void setBillingrate(float billingrate)
			{
				this.billingrate=billingrate;
			}
		public ArrayList<Employee> getEmp()
			{
				return emp;
			}
		public void setEmp(ArrayList<Employee> emp)
			{
				this.emp=emp;
			}
	}
    

