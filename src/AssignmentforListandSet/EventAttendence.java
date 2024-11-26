package AssignmentforListandSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EventAttendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>events= new HashSet<String>();
		List<String>attendes= new ArrayList<String>();
		
		do {
			
			Scanner sc = new Scanner(System.in);
			String userEvents=sc.next();
			events.add(userEvents);
			
		}while(true);

	}

}
