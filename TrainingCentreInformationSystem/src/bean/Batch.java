package bean;
import util.*;

public class Batch
	{
		String batchId;
		Stream stream;
		TechnicalInstructor techLead;
		SoftSkillsInstructor bizLead;
		int currentCapacity;

		public Batch(String batchId,Stream stream)
			{
				this.batchId=batchId;
				this.stream=stream;
			}
		public String getBatchId()
			{
				return batchId;
			}
		public void setBatchId(String batchId)
			{
				this.batchId=batchId;
			}
		public Stream getStream()
			{
				return stream;
			}
		public void setStream(Stream stream)
			{
				this.stream=stream;
			}
		public TechnicalInstructor getTechLead()
			{
				return techLead;
			}
		public void setTechLead(TechnicalInstructor techLead)
			{
				this.techLead=techLead;
			}
		public SoftSkillsInstructor getBizLead()
			{
				return bizLead;
			}
		public void setBizLead(SoftSkillsInstructor bizLead)
			{
				this.bizLead=bizLead;
			}
			public void setCurrentCapacity(){
				this.currentCapacity++;
			}
			public int getCurrentCapacity(){
				return this.currentCapacity;
			}


	}
