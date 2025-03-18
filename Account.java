package Java;

public class Account {
	int accno;
	String accname;
	double amount;
	
	
	public Account(int accno, String accname, double amount) {
		this.accno = accno;
		this.accname = accname;
		this.amount = amount;
		
		
	}
	
	public void deposit(double amt) {
		if(amt > 0) {
			amount = amount + amt;  // amt is a variable taken as double
			System.out.println("Deposited amount : "+amt);
		}
		else {
			System.out.println("add valid amount! ");
		}
		
	}
	
	
	
	public void withdraw(double amt) {
		
		if(amt > 0 && amt <= amount) {
			amount = amount - amt;
			System.out.println("Withrawl amount : "+amt);
		}
		else {
			System.out.println("Insufficiant balance! ");
		}
		
	}
	
	
	
	public void interest(double rate, int year) {
		double interestAmount;
		if(rate>0 && year > 0) {
			interestAmount = (amount*rate*year)/100;
			amount = amount + interestAmount;
		}
		else {
			System.out.println("Enter valid rate or valid year ");
		}
		
		
		
	}
	
	public void display() {
		System.out.println("Enter accno : " + accno);
		System.out.println("Enter accname : " + accname);
		System.out.println("Enter acc holder amount : " + amount);
	}
	
	

}
