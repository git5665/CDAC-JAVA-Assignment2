package Java;

public class TestAccount {
	public static void main(String arg[]) {
		
		
		Account ac = new Account(101, "Vipul saini", 10000);
		
		
		System.out.println("Initial acoount details ");
		ac.display();
		
		
		ac.deposit(2000.000);//testing by deposit 2000
		
		ac.withdraw(3000.000); // testing by withdrawl 3000
		
		ac.interest(1, 1);  // testing by taking interest of 1% for 1 year
		
		System.out.println('\n');
		System.out.println("Updated account details : ");
		ac.display();
		
		
		
		
		
		
	}

}
