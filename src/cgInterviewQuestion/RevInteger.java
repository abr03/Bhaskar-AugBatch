package cgInterviewQuestion;

public class RevInteger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int i=203;
		
		int rev=0;
		
		while(i>0) {
			
		rev= rev*10+ i %10;
		i=i/10;
		

		}
		System.out.printl("number is "+rev);


		

	}

}
