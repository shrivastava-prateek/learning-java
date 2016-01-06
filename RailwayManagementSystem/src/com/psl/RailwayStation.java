package com.psl;
import com.bean.*;
import java.util.*;

public class RailwayStation
	{
		String stationName;
		int platformCount;
		ArrayList<Platform> pList;
		ArrayList<Train> tList;
		RailwayStation(String stationName,int platformCount)
			{
				this.stationName=stationName;
				this.platformCount=platformCount;
				ArrayList<Platform> pList=new ArrayList<>();
				for(int i=1;i<=platformCount;i++)
					{
						Platform p=new Platform(i);
						pList.add(p);

					}
				this.pList=pList;

			}

		public Platform getFreePlatform()
			{
				for(Platform p:this.pList)
					{
						if(!(p.isAllottedStatus))
							{
								return p;
							}
					}
				return null;
			}

		public Train findTrain(String trainName)
			{
				for(Train t:tList)
					{
						if(t.getTrainName().equals(trainName))
							{
								return t;
							}
					}

				return null;

			}
		public void trainArrival(String trainName,String arrivalTime)
			{
				Train t=new Train(trainName,arrivalTime);
				tList.add(t);
				Platform p=getFreePlatform();
				if(p!=null)
					{
						t.setWaitStatus(false);

						p.train=t;
						p.isAllottedStatus=true;

					}
				else t.setWaitStatus(true);

			}

		public void assignPlatformToTrainOnWait()
			{
				for(Train t:tList)
					{
						if(t.isWaitStatus())
							{
								Platform p=getFreePlatform();
								if(p!=null)
									{p.train=t;
										p.isAllottedStatus=true;
										t.setWaitStatus(false);
									}
							}
					}
			}

		public void trainDeparture(String trainName)
			{
				ArrayList<Train> tList2=new ArrayList<>(tList);
				for(Train t:tList2)
					{
						if(t.getTrainName().equals(trainName))
							{
								for(Platform p:pList)
									{
										if(p.train==t)
											{
												tList.remove(t);
												p.isAllottedStatus=false;
												p.train=null;
												assignPlatformToTrainOnWait();
											}
									}
							}
					}
			}

		public Train getTrainOnPlatform(int platformNumber)
			{
				for(Platform p:pList)
					{
						if(p.platformNumber==platformNumber)
							{
								return p.train;
							}
					}
				return null;
			}

		public Platform getAllocatedPlatform(String trainName)
			{
				for(Train t:tList)
					{
						if(t.getTrainName().equals(trainName))
							{
								for(Platform p:pList)
									{
										if(t==p.train)
											{
												return p;
											}
									}
							}
					}
				return null;
			}

	}
