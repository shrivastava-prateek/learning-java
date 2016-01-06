package bean;

public class Doctor
	{
		private String docName;
		private String depName;


		public String getDocName()
			{
				return docName;
			}

		public void setDocName(String docName)
			{
				this.docName=docName;
			}

		public String getDepName()
			{
				return depName;
			}

		public void setDepName(String depName)
			{
				this.depName=depName;
			}

		public Doctor(String docName,String depName)
			{
				this.depName=depName;
				this.docName=docName;
			}

	}

