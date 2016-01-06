package bean;

public class Appointment
	{
		//private Date dt;
		private Patient pt;
		private int dt;
		private Doctor dc;

		public Patient getPt()
			{
				return pt;
			}
		public Doctor getDc()
			{
				return dc;
			}
		public void setDc(Doctor dc)
			{
				this.dc=dc;
			}
		public void setPt(Patient pt)
			{
				this.pt=pt;
			}

		public int getDt()
			{
				return dt;
			}
		public void setDt(int dt)
			{
				this.dt=dt;
			}
		public Appointment(Patient pt,Doctor dc,int dt)
			{
				this.dc=dc;
				this.pt=pt;
				this.dt=dt;
			}


	}
