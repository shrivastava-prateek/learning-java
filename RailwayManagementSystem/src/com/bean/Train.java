package com.bean;

public class Train
	{
		String trainName ;
		String arrivalTime;
		boolean waitStatus ;
		public Train(String trainName,String arrivalTime)
			{
				this.waitStatus=false;
				this.arrivalTime=arrivalTime;
				this.trainName=trainName;
			}
		public String getTrainName()
			{
				return trainName;
			}
		public void setTrainName(String trainName)
			{
				this.trainName=trainName;
			}
		public String getArrivalTime()
			{
				return arrivalTime;
			}
		public void setArrivalTime(String arrivalTime)
			{
				this.arrivalTime=arrivalTime;
			}
		public boolean isWaitStatus()
			{
				return waitStatus;
			}
		public void setWaitStatus(boolean waitStatus)
			{
				this.waitStatus=waitStatus;
			}


	}
