package util;
import java.util.*;
import bean.*;
import java.io.*;

public class GiftItemsDeliverySystem
	{
		public List<Customer> populateCustomers()
			{
				return null;
			}

		public List<GiftItems> populateGiftItems(String fileName)
			{
				List<GiftItems> listG=new ArrayList<>();
				Scanner sc=null;
				try
					{
						sc=new Scanner(new File(fileName));
						while(sc.hasNext())
							{
								String[] data=sc.nextLine().split("=");
								int price=Integer.parseInt(data[1].trim());
								if(price==1000)
									{
										String[] data1=data[0].split(",");
										String[] data11=data1[0].split(":");
										String[] data12=data1[1].split(":");
										String[] data13=data1[2].split(":");
										int dryFruits=Integer.parseInt(data11[1].trim());

										int chocolates=Integer.parseInt(data12[1].trim());
										int sweets=Integer.parseInt(data13[1].trim());
										GiftItems gi=new GiftItems(price,dryFruits,chocolates,sweets);
										listG.add(gi);

									}
								else
									{
										if(price==500)
											{
												String[] data1=data[0].split(",");
												String[] data11=data1[0].split(":");
												String[] data12=data1[1].split(":");
												//String[] data13=data1[2].split(":");
												int chocolates=Integer.parseInt(data11[1].trim());

												int sweets=Integer.parseInt(data12[1].trim());
												//int sweets=Integer.parseInt(data13[1].trim());
												GiftItems gi=new GiftItems(price,0,chocolates,sweets);
												listG.add(gi);

											}
										else
											{
												String[] data1=data[0].split(",");
												String[] data11=data1[0].split(":");
												String[] data12=data1[1].split(":");
												//String[] data13=data1[2].split(":");
												int dryFruits=Integer.parseInt(data11[1].trim());

												int sweets=Integer.parseInt(data12[1].trim());
												//int sweets=Integer.parseInt(data13[1].trim());
												GiftItems gi=new GiftItems(price,dryFruits,0,sweets);
												listG.add(gi);

											}
									}
							}
					}
				catch(FileNotFoundException e)
					{e.printStackTrace();}

				return listG;
			}
	}
