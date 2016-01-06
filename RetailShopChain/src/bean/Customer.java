package bean;

public class Customer
	{
		int cardNo;
		String name;
		int amount;
		int rewardPoint;
		int billAmount;

		public int getRewardPoint()
			{
				return rewardPoint;
			}
		public void setRewardPoint(int rewardPoint)
			{
				
				this.rewardPoint+=rewardPoint;
			}
		public int getBillAmount()
			{
				return billAmount;
			}
		public void setBillAmount(int billAmount)
			{
				this.billAmount+=billAmount;
			}
		public void redeemPoints(int points)
			{
				rewardPoint-=points;
			}
		public Customer(String name,int amount,int cardNo)
			{
				super();
				this.name=name;
				this.amount=amount;
				this.cardNo=cardNo;
				this.billAmount=0;
				this.rewardPoint=0;
			}
		public int getCardNo()
			{
				return cardNo;
			}
		public void setCardNo(int cardNo)
			{
				this.cardNo=cardNo;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name=name;
			}
		public int getAmount()
			{
				return amount;
			}
		public void setAmount(int amount)
			{
				this.amount=amount;
			}



	}
