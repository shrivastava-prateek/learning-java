package com.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Cheese extends Item
	{
		public CheeseType cheeseType ;
		public Map<Ingred,Float> calorieTable = new HashMap<Ingred,Float>();


		public Cheese()
			{
			}
		public Cheese(int id,String description,float weight,float price,Date mfg,int useBeforM,CheeseType cht,float pro,float vita,float fat)
			{
				super(id,description,weight,price,mfg,useBeforM);
				this.cheeseType=cht;
				this.calorieTable.put(Ingred.protein,pro);
				this.calorieTable.put(Ingred.vitamin,vita);
				this.calorieTable.put(Ingred.fat,fat);
			}


		public CheeseType getCheeseType()
			{
				return cheeseType;
			}

		public void setCheeseType(CheeseType cheeseType)
			{
				this.cheeseType=cheeseType;
			}

		public Map<Ingred, Float> getCalorieTable()
			{
				return calorieTable;
			}

		public void setCalorieTable(Map<Ingred, Float> calorieTable)
			{
				this.calorieTable=calorieTable;
			}


		@Override
		public String toString()
			{ 
				SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");

				return this.getId()
					+","
					+this.getDescription()
					+","
					+this.getWeight()
					+","
					+this.getPrice()
					+","
					+this.getManufacturingDate()
					+","
					+this.getUseBeforeMonths()
					+","
					+(this.getExpiryDate()!=null?sdf.format(this.getExpiryDate()):null)
					+","
					+this.getCheeseType()
					+","
					+this.getCalorieTable();

			}
	}
