package psl;
import bean.*;
import java.util.*;

public class Client
{
	static int i=0;
	public static void main(String[] args){
		System.out.println("Registering for a privilege card");
		
		
		Customer c=new Customer("Prateek",0,i++);
		HorizonRetail hr=new HorizonRetail();
		ArrayList<Customer> custList=hr.getCustList();
		custList.add(c);
		
		System.out.println("Generating bill");
		System.out.println("Card no. of customer is 1 having a bill of 200/-Rs");
		for(Customer cust:custList){
			if(cust.getCardNo()==1){
				System.out.println("Card holder name : "+cust.getName());
				cust.setBillAmount(200);
				int rpoint=200/100;
				cust.setRewardPoint(rpoint);
				break;
			}
		}
		
		
		
	}
}
