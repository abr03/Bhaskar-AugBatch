package day23Set;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	
public static void main(String[] args) {
	
	ArrayList<Integer> values=new ArrayList<Integer>();
	
	values.add(15);
	
	values.add(1);
	
	values.add(150);
	
	values.add(5);
	
	System.out.println(values);
	
	Collections.sort(values);

	System.out.println(values);
	
}

}
