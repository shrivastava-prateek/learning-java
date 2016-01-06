package bean;

public class Patient
	{
		private int opId;
		private String name;

		public Patient()
			{

			}
		public Patient(int opId,String name)
			{
				this.name=name;
				this.opId=opId;
			}
		public int getOpId()
			{
				return opId;
			}
		public void setOpId(int opId)
			{
				this.opId=opId;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name=name;
			}


	}
