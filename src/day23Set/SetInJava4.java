package day23Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInJava4 {
	
	public static void main(String[] args) {
		// no order maintained
					HashSet<String> toolsold=new HashSet<String>();
					toolsold.add("TestNG");
					toolsold.add("Maven");
					toolsold.add("JUnit");
					toolsold.add("Zalenium");
					toolsold.add("Aws");
					toolsold.add(null);
					
					System.out.println("Values from hashset "+toolsold);
					
					// maintain insertion order
					LinkedHashSet<String> tools=new LinkedHashSet<String>();
					tools.add("TestNG");
					tools.add("Maven");
					tools.add("JUnit");
					tools.add("Zalenium");
					tools.add("Aws");
					tools.add(null);
					System.out.println("Values from LinkedHashSet "+tools);
					
					TreeSet<String> toolsNew=new TreeSet<String>();
					toolsNew.add("TestNG");
					toolsNew.add("Maven");
					toolsNew.add("JUnit");
					toolsNew.add("Zalenium");
					toolsNew.add("Aws");
					toolsNew.add(null);
					
					System.out.println("Values from Treeset "+toolsNew);
					

			
		}
	}

	
