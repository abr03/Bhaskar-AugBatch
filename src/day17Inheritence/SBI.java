package day17Inheritence;

public class SBI extends Bank{

	 int  roi;
	public void FixedDeposit() {
		System.out.println(" FD--By SBI");
	}
	
	public void personalLoan(int i) {
		System.out.println(" sbiinterest:"+i);
	}
}
