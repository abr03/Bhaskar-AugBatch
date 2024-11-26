package day19Interfaces;

public class ChromeDriver implements Webdriver {

	@Override
	public void close() {
       System.out.println("ClOSE THE BROWSER--chrome");		
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
	       System.out.println("LAUNCH THE BROWSER--CHROME");		

	}

	@Override
	public void foward() {
		// TODO Auto-generated method stub
	       System.out.println("FOWARD THE BROWSER--CHROME");		

	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
	       System.out.println("BACK THE BROWSER--CHROME");		

	}

	@Override
	public void naviagate() {
		// TODO Auto-generated method stub
	       System.out.println("NAVIGATE THE BROWSER--CHROME");		

		
	}

	@Override
	public void W3C() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMethod() {
		// TODO Auto-generated method stub
		
	}

}
