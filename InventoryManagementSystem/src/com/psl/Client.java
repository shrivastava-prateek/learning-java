package com.psl;
import com.util.*;
import com.bean.Item;
import java.util.List;
import com.exception.*;

public class Client
	{

		/**
		 * @param args
		 */

		public static void main(String[] args)
			{
				InventoryService is=new InventoryServiceImpl();
				List<Item> items=is.readAllItemsFromDb();
				System.out.println("Total items : "+items.size());
				for(Item item:items)
					{
						System.out.println(item);
					}

				is.calculateExpiryDate(items);
				System.out.println("\nExpiry date calculated");
				for(Item item:items)
					{
						System.out.println(item);
					}
				is.removeExpiredItems(items);
				System.out.println("\nNo. of items remaining : "+items.size());
				for(Item item :items)
					{
						System.out.println(item);
					}
					System.out.println("\nYou searched for :");
				List<Item> searchedItems=null;
				try
					{
						searchedItems=is.searchItem("go",items);
						for(Item item:searchedItems)
							{
								System.out.println(item);
							}
					}
				catch(NoDataFoundException e)
					{
						e.printStackTrace();
						//System.out.println(e);
					}
			}

	}
