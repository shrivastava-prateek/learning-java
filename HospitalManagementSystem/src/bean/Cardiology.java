package bean;

public class Cardiology extends Department
	{
		String depName;

		public String getDepName()
			{
				return depName;
			}

		public void setDepName(String depName)
			{
				this.depName=depName;
			}

		public Cardiology(String depName)
			{
				this.depName=depName;
			}

	}
