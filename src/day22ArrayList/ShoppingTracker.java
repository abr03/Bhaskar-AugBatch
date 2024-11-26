package day22ArrayList;

import java.awt.event.ItemEvent;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item=null;
		ArrayList<String>shoppingList= new ArrayList<String>();
        System.out.println("Please start shopping");

		Scanner sc = new Scanner(System.in);
		do {
			 item=sc.next();
			shoppingList.add(item);
			
			
		}while(!item.contains("done"));
		
		if(shoppingList.contains("done")) {
			shoppingList.remove("done");
		}
		sc.close();
		System.out.println("No of items:"+ shoppingList.size());
		System.out.println("Shopping List: "+ shoppingList);

		
		

	}
}


