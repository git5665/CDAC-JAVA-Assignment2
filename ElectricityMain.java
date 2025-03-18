package Java;

public class ElectricityMain {
	
	public static void main(String arg[]) {
		
		ElectricityBill eb = new ElectricityBill();
		eb.readData();
		System.out.println("---------------------------------");
		eb.showData();
		
		System.out.println("Total amount of Bill is : Rs. " );
		eb.computeBill();
		
		
		
	}

}
