package BreakOutSession1;

public class Vehcile {
	
	String model;
	String brand;
	
	
	public Vehcile(String brand,String model) {
		this.brand=brand;
		this.model=model;

	}
	
	public void displayInfo() {
		
		System.out.println("Brand of the vehicle:"+ brand);
		System.out.println("model of the vehicle:"+ model);


	}

	
	
}
