package BreakOutSession1;

public class test2 extends test1 {

	
	public void sum() {
		System.out.println("This is from Test 2");
	}
	
	public static void main(String[] args) {
		
		test1 t= new test1();
		t.sum();
		test2 tt= new test2();
		tt.sum();
	}

}
