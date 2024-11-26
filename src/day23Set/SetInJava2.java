package day23Set;

import java.util.HashSet;

public class SetInJava2 {

	/*
	 * does not maintain Insertion order
	 */public static void main(String[] args) {
		 HashSet<String> names=new HashSet<String>();
			
			names.add("Selenium");
			names.add("NightWatch");
			names.add("Tosca");
			names.add("Zalenium");
			names.add("RestAssured");
			names.add("Selenium");
			
			System.out.println(names.contains("Sameer"));
			
			System.out.println(names.size());
			
			for(String name:names)
			{
				System.out.println(name);
				
				if(name.contains("Jenkins"))
				{
					System.out.println("Element found");
					break;
				}

			}

	}
	
}
