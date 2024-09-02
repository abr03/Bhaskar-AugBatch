package BreakOutSession1;

import java.util.Scanner;

public class StudentManagmentSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int student=sc.nextInt();
		
		System.out.println("Enter the number of Students :"+student);
		System.out.println("Enter Student information for student #1");
		
		for (int i=0; i <student; i ++) {
			String FirstName=sc.next();
			System.out.println("FirstName:"+FirstName);
			
			String LastName=sc.next();
			System.out.println("LastName:"+LastName);
			
			
			int studentID=sc.nextInt();
			System.out.println("studentID :"+studentID);
			
			
			String Email=sc.next();
			
			System.out.println("Email :"+ Email);
			
		}
		
		
		
	


		
	}

}
