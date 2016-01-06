package bean;

public class ENT extends Department
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

		public ENT(String depName)
			{
				this.depName=depName;
			}


	}
