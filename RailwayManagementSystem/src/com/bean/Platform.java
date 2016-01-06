package com.bean;

public class Platform
	{
		public int platformNumber;
		public boolean isAllottedStatus;
		public Train train;

		public Platform(int platformNumber)
			{
				this.platformNumber=platformNumber;
				this.isAllottedStatus=false;
				this.train=null;
			}

	}
