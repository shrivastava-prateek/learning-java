package bean;
import java.util.*;

public class Department
	{
		ArrayList <Doctor> docList=new ArrayList<Doctor>();
		private String depName;

		public ArrayList<Doctor> getDocList()
			{
				return docList;
			}

		public void setDocList(ArrayList<Doctor> docList)
			{
				this.docList=docList;
			}

		public String getDepName()
			{
				return depName;
			}

		public void setDepName(String depName)
			{
				this.depName=depName;
			}

		public void addDoctor(Doctor dc)
			{
				docList.add(dc);
			}
	}
