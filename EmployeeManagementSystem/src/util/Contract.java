
import java.util.*;public class Contract implements BillingRateCalculationInterface
	{

		@Override
		public int generatebillingrate(Project p)
			{
				int perHr=100;
				int total=0;
				ArrayList<Employee> emp=p.getEmp();
				for(Employee e:emp)
					{
						if(e.getEmployeeType().equalsIgnoreCase("contract")){
								total=total+e.getNoOfDaysWorked()*perHr*9;
							}
					}

				return total;
			}

	}
