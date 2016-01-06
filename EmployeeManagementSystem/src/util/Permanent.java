
import java.util.*;public class Permanent implements BillingRateCalculationInterface
	{

		@Override
		public int generatebillingrate(Project p)
			{
				int perHr=200;
				int total=0;
				ArrayList<Employee> emp=p.getEmp();
				for(Employee e:emp)
					{
						if(e.getEmployeeType().equalsIgnoreCase("Permanent"))
							{
								total=total+e.getNoOfDaysWorked()*perHr*9;
							}
					}

				return total;
			}

	}
