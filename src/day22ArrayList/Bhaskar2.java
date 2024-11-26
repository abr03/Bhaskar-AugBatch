package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Bhaskar2 {
	
	public static void main(String[] args) {
		Bhaskar abr= new Bhaskar("Nanu", "ndia");
		Bhaskar abr1= new Bhaskar("Sonu", "ndia");
		Bhaskar abr2= new Bhaskar("Nikhil", "ndia");
		Bhaskar abr3= new Bhaskar("Bhaskar", "ndia");


		

		
		List<Bhaskar>l1= new ArrayList<Bhaskar>();
		l1.add(abr);
		l1.add(abr1);
		l1.add(abr2);
		l1.add(abr3);


		
		System.out.println(l1.get(0).name);
	}
	
	
}
