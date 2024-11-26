package cgInterviewQuestion;

public class leapYear {

	
	public static void main(String[] args) {
		
		leapYearorNot(2100);
		
		
	}
	
	public static void leapYearorNot(int year) {
		
		if(year %4==0 && year % 100 !=0 && year % 400 == 0) {
			
			System.out.println("It is a leap year " +year);
			
		}
		
		else {
			System.out.println("Not a leap year");
		}
		
	}
}
