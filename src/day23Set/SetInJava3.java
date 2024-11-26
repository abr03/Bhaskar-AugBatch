package day23Set;

import java.util.ArrayList;
import java.util.HashSet;

public class SetInJava3 {

	/*
	 * does not maintain Insertion order
	 */public static void main(String[] args) {
		 HashSet<String> tools=new HashSet<String>();
			tools.add("TestNG");
			tools.add("Maven");
			tools.add("JUnit");
			System.out.println("hashSet "+tools);
			
			ArrayList<String> devops=new ArrayList<String>();
			devops.add("Docker");
			devops.add("Docker");
			devops.add("K8");
			devops.add("Terraform");
			
			System.out.println("Array List"+devops);

			HashSet<String> names=new HashSet<String>();
			names.add("Java");
			names.add("JS");
			names.addAll(tools);
			names.addAll(devops);
			
			System.out.println("HashSet "+names);
	
}
}