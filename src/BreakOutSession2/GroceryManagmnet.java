package BreakOutSession2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class GroceryManagmnet {
	
	
	public static void main(String[] args) {
		int choices;
		String item;
		Scanner sc = new Scanner(System.in);
		
		List<String> items= new LinkedList<String>();
		
		while(true) {
			System.out.println("Grocery List Manager");
			System.out.println("1. Add item");
			System.out.println("2. Remove Item");
			System.out.println("3. View list");
			System.out.println("4. Clear List");
			System.out.println("5. Exit");
			choices=sc.nextInt();
			//System.out.println("Enter your choice:"+choices);
			item=sc.next();

			switch (choices) {
			case 1:
			   System.out.println("Enter item to add:"+item);
			   items.add(item);
			   System.out.println(item+ ":is been added to your list");
			   for(String ite: items) {
				   System.out.println("No of items:" +ite);
			   }
				break;
				
			case 2:
				System.out.println("Enter item to remove"+item);
				items.remove(item);
				break;
			case 3:
				 System.out.println("Current Grocery List:");
                 for (int i = 0; i < items.size(); i++) {
                     System.out.println((i + 1) + ". " + items.get(i));
                 }
 				break;

			case 4:
				System.out.println("Clearing the shopping list.");
                items.clear();
                break;
			case 5:
				System.out.println("You have finished Shopping:");
				break;
				
				default:
					System.out.println("Invalid Choice "+choices);
			}
			
			
			

		}
	
}
	
	
		
	}

