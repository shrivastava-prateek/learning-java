package bean;
import java.util.*;
public class Customer
	{
		public int customerID;
		String customerName;
		int customerNo;
		ArrayList<Product> bookedProductList=new ArrayList<Product>();

		public void addBookedProduct(Product obj)
			{
				obj.setProductStatus("unavailable");
				bookedProductList.add(obj);
			}
		public int getCustomerID()
			{
				return customerID;
			}
		public void setCustomerID(int customerID)
			{
				this.customerID=customerID;
			}
		public String getCustomerName()
			{
				return customerName;
			}
		public void setCustomerName(String customerName)
			{
				this.customerName=customerName;
			}
		public int getCustomerNo()
			{
				return customerNo;
			}
		public void setCustomerNo(int customerNo)
			{
				this.customerNo=customerNo;
			}
		public Customer(int customerID,String customerName,int customerNo)
			{
				super();
				this.customerID=customerID;
				this.customerName=customerName;
				this.customerNo=customerNo;
			}
			public ArrayList<Product> getProductList(){
				return this.bookedProductList;
			}






	}
