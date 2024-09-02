package day17Inheritence;

public class TestBank {
	
	public static void main(String[] args) {
		
		SBI sbi= new SBI();
		sbi.FixedDeposit();
		System.out.println(sbi.roi);
		sbi.personalLoan(9);
		
		
		
		Bank bank= new Bank();
		bank.FixedDeposit();
		System.out.println(bank.roi);
		
		

		
	}

}
