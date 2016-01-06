package bean;
public class Product
	{
		public int productID;
		String productName;
		double productPrice;
		String productStatus="Available";

		public  String getProductStatus()
			{
				return productStatus;
			}
		public void setProductStatus(String productStatus)
			{
				this.productStatus=productStatus;
			}
		public int quantity;

		public int getQuantity()
			{
				return quantity;
			}
		public void setQuantity(int quantity)
			{
				this.quantity=quantity;
			}
		public int getProductID()
			{
				return productID;
			}
		public void setProductID(int productID)
			{
				this.productID=productID;
			}
		public String getProductName()
			{
				return productName;
			}
		public void setProductName(String productName)
			{
				this.productName=productName;
			}
		public double getProductPrice()
			{
				return productPrice;
			}
		public void setProductPrice(double productPrice)
			{
				this.productPrice=productPrice;
			}
		public Product(int productID,String productName,double productPrice)
			{
				super();
				this.productID=productID;
				this.productName=productName;
				this.productPrice=productPrice;


			}



		

	}
