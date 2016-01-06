package com.bean;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Wheat extends Item
	{
		private WheatType wheatType;

		public Wheat()
			{
			}
		public Wheat(int id,String description,float weight,float price,Date mfg,int useBeforM,WheatType wt)
			{
				super(id,description,weight,price,mfg,useBeforM);
				this.wheatType=wt;
			}

		public WheatType getWheatType()
			{
				return wheatType;
			}

		public void setWheatType(WheatType wheatType)
			{
				this.wheatType=wheatType;
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
					+this.getWheatType();
			}
	}
