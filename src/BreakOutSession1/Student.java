package BreakOutSession1;

public class Student {
	
	
	String firstname;
	String lastname;
	int StudentID;
	String email;
	String [] courses;
	
	
	//Implement a consturctor
	
	public Student(String firstname, String lastname, int StudentID, String email, String courses[]) {
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.StudentID=StudentID;
		this.email=email;
		this.courses=courses;
	}


	/**
	 * @return the firstname
	 */

	public int getCourses(int courses) {
		
		return courses;
	}
	
	
	
	

}
