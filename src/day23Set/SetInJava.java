package day23Set;

import java.util.HashSet;

public class SetInJava {

	/*
	 * does not maintain Insertion order
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names=new HashSet<String>();
		
		names.add("Selenium");
		names.add("NightWatch");
		names.add("Tosca");
		names.add("Zalenium");
		names.add("RestAssured");
		names.add("Selenium");
		names.add(null);
		names.add(null);
	
		System.out.println(names);
	}

}
