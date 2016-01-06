package com.bean;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Milk extends Item
	{
		private float fatRate;
		private MilkType milkpacket;

		public Milk()
			{

			}
		public Milk(int id,String description,float weight,float price,Date mfg,int useBeforM,float fatRate,MilkType mt)
			{
				super(id,description,weight,price,mfg,useBeforM);
				this.milkpacket=mt;
				this.fatRate=fatRate;
			}

		public float getFatRate()
			{
				return fatRate;
			}

		public void setFatRate(float fatRate)
			{
				this.fatRate=fatRate;
			}


		public MilkType getMilkpacket()
			{
				return milkpacket;
			}

		public void setMilkpacket(MilkType milkpacket)
			{
				this.milkpacket=milkpacket;
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
					+this.getFatRate()
					+","
					+this.getMilkpacket();
			}
	}


