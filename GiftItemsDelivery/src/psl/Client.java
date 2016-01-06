package psl;
import util.*;
import bean.*;
import java.util.*;

public class Client
	{
		public static void main(String[] args)
			{
				GiftItemsDeliverySystem gfs=new GiftItemsDeliverySystem();
				String fileName="/ext_card/Files/App Attached/Programs/JAVAworkspace/GiftItemsDelivery/GiftItems.txt";
				List<GiftItems> listG=gfs.populateGiftItems(fileName);
				for(GiftItems g:listG)
					{
						System.out.println(g);
					}
			}
	}
