package BreakOutSession1;

public class Car extends Vehcile{

	String brand;
	String model;
	
	public Car(String brand,String model) {
		super(brand, model);
		this.brand=brand;
		this.model=model;
	}
    public void displayInfo() {
		super.displayInfo();
		System.out.println("Brand of the vehicle:"+ this.brand);
		System.out.println("model of the vehicle:"+ this.model);


	}

	
	
	
	

}
