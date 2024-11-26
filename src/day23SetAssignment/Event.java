package day23SetAssignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>partcipants= new HashSet<String>();
		System.out.println("Enter Input");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			String value=sc.next();
			partcipants.add(value);
			if(value.equalsIgnoreCase("done"))
				break;
		}
		System.out.println("No of partcipants:"+ partcipants.size());

		for (String partci: partcipants) {
			System.out.println(partci);
		}

	}

}
