package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentManagmentSystem {

	public static void main(String[] args) {
		List<String> morning=new ArrayList<String>();
		morning.add("Ayaskanta");
		morning.add("Samir");
		
		List<String> evening=new ArrayList<String>();
		evening.add("Dinesh");
		evening.add("Neha");
		
		List<String> weekend=new ArrayList<String>();
		weekend.add("Sirish");
		weekend.add("Abhishek");
		weekend.add("Chitra");
		
	
		//Create a Database 
		
		List<List<String>> masterbatch= new ArrayList<List<String>>();
		
		System.out.println(masterbatch.add(morning));
		System.out.println(masterbatch.add(evening));
		System.out.println(masterbatch.add(weekend));
		
		System.out.println(masterbatch.get(0).get(0));



	}
}
