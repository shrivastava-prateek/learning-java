package bean;

public class GiftItems
	{
		int totalPrice;
		int dryFruits;
		int chocolates;
		int sweets;
		public GiftItems(int totalPrice,int dryFruits,int chocolates,int sweets)
			{
				this.totalPrice=totalPrice;
				this.dryFruits=dryFruits;
				this.chocolates=chocolates;
				this.sweets=sweets;
			}

		public void setTotalPrice(int totalPrice)
			{
				this.totalPrice=totalPrice;
			}

		public int getTotalPrice()
			{
				return totalPrice;
			}

		public void setDryFruits(int dryFruits)
			{
				this.dryFruits=dryFruits;
			}

		public int getDryFruits()
			{
				return dryFruits;
			}

		public void setChocolates(int chocolates)
			{
				this.chocolates=chocolates;
			}

		public int getChocolates()
			{
				return chocolates;
			}

		public void setSweets(int sweets)
			{
				this.sweets=sweets;
			}

		public int getSweets()
			{
				return sweets;
			}
		@Override
		public String toString()
			{
				return this.totalPrice
					+","
					+this.dryFruits
					+","
					+this.chocolates
					+","
					+this.sweets;
			}

	}
