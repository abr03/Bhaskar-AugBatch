package day22ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example2 {

	/*1. Can Add Duplicates
	 * Can Add Null Values
	 * Maintains Indexing
	 * Slow 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList rrr= new ArrayList<>();
		rrr.add("JR.NTR");
		rrr.add("RajMouli");
		rrr.add("RamCharan");
		rrr.add(true);
		rrr.add(true);
		rrr.add(null);
		
		//ar3 can access only Collection and Object and List,ArrayList,Iterable Methods

		ArrayList ar3= new ArrayList<>();



		//ar1 can access only Iterable,Collection and Object and List Methods

		List ar1= new ArrayList<>();
		
		System.out.println("List:" +ar1.addAll(rrr));
		System.out.println("List:" +ar1.size());
		
		
		//ar2 can access only Collection,Iterable and Object Methods
		Collection ar2= new ArrayList<>();
		
		
		//ar5 can access only Iterable  and Object Methods

		Iterable ar5= new ArrayList<>();
		
       String s=new String("Mukesh");
       s="Otwani";
		
		System.out.println(s.charAt(0));

		

		
		
		


		
		
		
	

		


	}

}
