package com.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import com.bean.Item;
import com.exception.NoDataFoundException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import com.bean.Cheese;
import com.bean.CheeseType;
import com.bean.Milk;
import com.bean.MilkType;
import com.bean.Wheat;
import com.bean.WheatType;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.*;

// Override and implement all the methods of DBConnectionUtil Interface in this class
public class InventoryServiceImpl implements InventoryService
	{

		@Override
		public List<Item> readAllItemsFromDb()
			{
				List<Item> item=new ArrayList<>();
				DatabaseConnectionManager dcm=new DatabaseConnectionManager();
				Connection con=null;
				Statement st=null;
				try
					{
						con=dcm.getConnection();
						st=con.createStatement();
					}
				catch(ClassNotFoundException e)
					{e.printStackTrace();}
				catch(SQLException e)
					{e.printStackTrace();}

				try
					{
						ResultSet rs1=st.executeQuery("SELECT * FROM cheese_tbl");
						while(rs1.next())
							{
								int id=rs1.getInt(1);
								String description=rs1.getString(2);
								float weight=rs1.getFloat(3);
								float price=rs1.getFloat(4);
								Date mfg=rs1.getDate(5);
								int useBeforeM=rs1.getInt(6);
								CheeseType cht=CheeseType.valueOf(rs1.getString(7));
								float pro=rs1.getFloat(8);
								float vita=rs1.getFloat(9);
								float fat=rs1.getFloat(10);
								Item ch=new Cheese(id,description,weight,price,mfg,useBeforeM,cht,pro,vita,fat);
								item.add(ch);
							}
					}
				catch(SQLException e)
					{e.printStackTrace();}
				try
					{
						ResultSet rs2=st.executeQuery("SELECT * FROM milk_tbl");

						while(rs2.next())
							{

								int id=rs2.getInt(1);
								String description=rs2.getString(2);
								float weight=rs2.getFloat(3);
								float price=rs2.getFloat(4);
								Date mfg=rs2.getDate(5);
								int useBeforeM=rs2.getInt(6);
								float fatRate=rs2.getFloat(7);
								MilkType mt=MilkType.valueOf(rs2.getString(8));

								Item m=new Milk(id,description,weight,price,mfg,useBeforeM,fatRate,mt);
								item.add(m);
							}
					}
				catch(SQLException e)
					{e.printStackTrace();}
				try
					{
						ResultSet rs3=st.executeQuery("SELECT * FROM wheat_tbl");
						while(rs3.next())
							{
								int id=rs3.getInt(1);
								String description=rs3.getString(2);
								float weight=rs3.getFloat(3);
								float price=rs3.getFloat(4);
								Date mfg=rs3.getDate(5);
								int useBeforeM=rs3.getInt(6);
								WheatType wt=WheatType.valueOf(rs3.getString(7));

								Item w=new Wheat(id,description,weight,price,mfg,useBeforeM,wt);
								item.add(w);
							}
					}
				catch(SQLException e)
					{e.printStackTrace();}
				try
					{
						dcm.closeConnection();
					}
				catch(SQLException e)
					{e.printStackTrace();}
				return item;
			}

		@Override
		public void calculateExpiryDate(List<Item> items)
			{
				for(Item item:items)
					{
						Date mfg=item.getManufacturingDate();
						int mon=item.getUseBeforeMonths();
						Calendar mfgc=Calendar.getInstance();
						mfgc.setTime(mfg);
						mfgc.add(Calendar.MONTH,mon);
						Date exp=mfgc.getTime();

						item.setExpiryDate(exp);
					}

			}

		@Override
		public void removeExpiredItems(List<Item> items)
			{
				Date now=new Date();
				Iterator<Item> it=items.iterator();
				while(it.hasNext())
					{
						Item item=it.next();
						if(item.getExpiryDate().before(now))
							{
								it.remove();
								System.out.println("Item removed");
							}
					}
			}

		@Override
		public void sortItems(List<Item> items)
			{
				Collections.sort(items,new Comparator<Item>(){

							@Override
							public int compare(Item p1,Item p2)
								{

									return p2.getExpiryDate().compareTo(p1.getExpiryDate());
								}
						});
			}

		@Override
		public void applyDiscount(List<Item> items)
			{
				for(Item item:items)
					{
						Calendar speci=Calendar.getInstance();
						speci.setTime(new Date());
						speci.add(Calendar.MONTH,6);
						if(item.getExpiryDate().before(speci.getTime()))
							{
								float f=item.getPrice();
								f=f-(0.30f*f);
								item.setPrice(f);
							}
					}
			}

		@Override
		public List<Item> searchItem(String ItemType,List<Item> list) throws NoDataFoundException
			{
				List<Item> searchedItems=new ArrayList<>();
				for(Item item:list)
					{
						if(item.getDescription().toUpperCase().contains(ItemType.toUpperCase()))
							{
								searchedItems.add(item);
							}
					}
				if(searchedItems.size()==0)
					{
						throw new NoDataFoundException();
					}
				return searchedItems;
			}


	}
