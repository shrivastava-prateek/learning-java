package bean;

public class Trainee
	{
		int id;
		String name;
		Batch batchId;

		public Trainee(int id,String name)
			{
				this.id=id;
				this.name=name;
			}

		public int getId()
			{
				return id;
			}
		public void setId(int id)
			{
				this.id=id;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name=name;
			}
		public Batch getBatchId()
			{
				return batchId;
			}
		public void setBatchId(Batch batchId)
			{
				this.batchId=batchId;
			}

		

	}
