package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	/*
	 *   int - Integer
	 *   float - Float
	 *   double - Double
	 *   char - Character
	 *   byte - Byte
	 *   short - Short
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * AutoBoxing, Holds Primitve Data Type
		 */
		ArrayList<Integer> list1=new ArrayList<Integer>();

		list1.add(12);
		
		list1.add(15);
		
		list1.add(78);
		
		list1.add(82);
	
		System.out.println(list1);
		
		
		ArrayList list2=new ArrayList();

		list2.add(12);
		
		list2.add(15);
		
		list2.add(78);
		
		list2.add(82);
	
		System.out.println(list2);
	}

}
