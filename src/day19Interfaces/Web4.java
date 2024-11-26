package day19Interfaces;

public abstract class Web4{

	
	static String driver;

	public static void main(String[] args) {
		
		Webdriver driver = new ChromeDriver();
		Webdriver driver1 = new EdgeDriver();
		
		driver.back();
		driver1.back();

		
	}
	
	
}
