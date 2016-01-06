package util;
import java.util.*;
import bean.*;
public class RetailStore
	{
		String storeName;
		ArrayList<Customer> custList=new ArrayList<>();
		ArrayList<Product> productList=new ArrayList<>();

		public int generateCustomerID()
			{if(custList.size()==0)
					{
						return 1;
					}
				return (custList.get(custList.size()-1).getCustomerID())+1;

			}
		public int generateProductID()
			{
				if(productList.size()==0)
					{
						return 1;
					}
				return (productList.get(productList.size()-1).getProductID())+1;
			}

		public void addCustomer(String name,int contactNo)
			{	
				int id=generateCustomerID();
				Customer c=new Customer(id,name,contactNo);
				custList.add(c);
			}

		public void addProduct(String name,String status,double price)
			{
				int pId=generateProductID();
				Product p=new Product(pId,name,price);
				productList.add(p);
			}


		public int checkProductAvailability(String productName)
			{int count=0;
				for(Product p:productList)
					{
						if((p.getProductName().equals(productName))&&(p.getProductStatus().equals("Available")))
							{
								count++;
							}
					}
				return count;
			}

		public String getStoreName()
			{
				return storeName;
			}

		public void setStoreName(String storeName)
			{
				this.storeName=storeName;
			}

		public RetailStore(String storeName)
			{
				super();
				this.storeName=storeName;
			}

		public void display()
			{

				for(Customer cust:custList)
					{
						System.out.println("Name: "+cust.getCustomerName()+" Number :  "+cust.getCustomerNo()+" ID: "+cust.getCustomerID());
					}
				for(Product pd:productList)
					{
						System.out.println("Pd Name  : "+pd.getProductName()+"Price  : "+pd.getProductPrice()+" P ID   : "+pd.getProductID()+"    status   :"+pd.getProductStatus());

					}

			}


		public int bookProduct(int customerID,String productName,int numberOfProducts) 
			{
				Customer cust=null;
				boolean flag=false;
				for(Customer c:custList)
					{
						if(c.getCustomerID()==customerID)
							{
								cust=c;
								flag=true;
								break;
							}
					}
				boolean flag1=false;
				if(flag&&(numberOfProducts>0))
					{
						int count=0;
						for(Product p:productList)
							{
								if((p.getProductName().equals(productName))&&(p.getProductStatus().equals("Available")))
									{
										flag1=true;count++;
										if(count<=numberOfProducts)
											{
												p.setProductStatus("Booked");
												cust.addBookedProduct(p);
											}
										if(count==numberOfProducts)
											{
												return count;
											}
									}
							}
						return count;
					}
				if(!flag1)
					{
						return 0;
					}
				return -1;
			}

		public double calculateNetAmount(int customerID,double discount)
			{
				double price=0.0;

				for(Customer c:custList)
					{
						if(customerID==c.getCustomerID())
							{
								for(Product p:c.getProductList())
									{
										price=price+p.getProductPrice();
									}
								price=price-(discount*price);
								return price;
							}
					}

				return -1;

			}





	}
