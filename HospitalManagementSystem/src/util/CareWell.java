package util;
import bean.*;
import java.util.*;

public class CareWell
	{
		ArrayList <Patient> pList=new ArrayList<Patient>();
		ArrayList <Department> dList=new ArrayList<Department>();
		ArrayList<Appointment> a=new ArrayList<Appointment>();

		public void addPatient(Patient p)
			{
				pList.add(p);
			}

		public void addDept(Department d)
			{
				dList.add(d);
			}

		public void addDoc(Doctor d)
			{
				for(Department dept:dList)
					{
						if(d.getDepName().equals(dept.getDepName()))
							{
								dept.addDoctor(d);
							}
					}
			}

		public void addAppoint(Appointment ap)
			{
				
			}

		public void addAppoint(Patient p,int dt)
			{
				

			}
	}
