package Java;

import java.util.Scanner;

public class ElectricityBill {
	
	String name;
	long number;
	int unit_Consumed;
	
	public void readData(){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter customer name : ");
		name = scn.nextLine();
		
		System.out.println("Enter customer mobile number : ");
		number = scn.nextLong();
		
		System.out.println("Enter Customer Electricity unit : ");
		unit_Consumed = scn.nextInt();
		
		
		
		
	}
	
	
	public void showData() {
		
		
		System.out.println("Customer name : "+name);
		System.out.println("Customer number : "+number);
		System.out.println("Customer bill consumed : "+unit_Consumed);
		
		
		
		
	}
	
	
	public void computeBill() {
		
//		int billAmount = 0;
//		int unit = unit_Consumed;
		
		
		if(unit_Consumed>0 && unit_Consumed <=100) {
			System.out.println(unit_Consumed*1);
		}
		else if(unit_Consumed>100 && unit_Consumed <=200) {
			System.out.println((100*1)+(unit_Consumed - 100)*2);
		}
		else if(unit_Consumed>200 && unit_Consumed <=300) {
			System.out.println((100*1)+(100*2)+(unit_Consumed - 200)*3);
			
		}
		else {
			System.out.println("Enter correct consumed electricity unit! Thank You! ");
		}
		
//		return billAmount;
		
	}
	

}





























