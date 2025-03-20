
interface BonusEligibility{
		public static boolean isEligibleForBonus(double sal) {
			if(sal>50000) {
				return true;
			}
			else {
				return false;
			}
		}
	  
 }





public abstract class Employee implements BonusEligibility{
	int empId; 
	String name; 
	String designation ;
	double salary ;
	double total_Sal;
	
	public Employee(int empId, String name, String designation, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		
	
	}
	
	abstract void calculateSalary();
	
}




 class PermanentEmployee extends Employee implements BonusEligibility{                
	
	

	public PermanentEmployee(int empId, String name, String designation, double salary) {
		super(empId, name, designation, salary);
		
	}

	
	public void calculateSalary() {
		
		int medAllow = 5000;
		total_Sal = salary + medAllow;
		boolean iseligible =BonusEligibility.isEligibleForBonus(total_Sal);
		if(iseligible) {
			System.out.println("You are eligible for Bonus ");
			total_Sal = medAllow+salary+20000;
			System.out.println("your total sal is "+total_Sal);
			
		}
		else {
			System.out.println("You are not eligible ");
			total_Sal = medAllow+salary;
			System.out.println("your total sal is "+total_Sal);
		}
		
	
		
	
		
	}
	
	
    
	
	public void displayPermanentEmpDetails() {
		System.out.println("Permanent Employee Details :  " );
		System.out.println('\n');
		
		System.out.println("Employee Id is " + empId );
		System.out.println("Employee name is " + name );
		System.out.println("Employee designation is " + designation );
		
		
		
		calculateSalary();
		
		System.out.println("========================================");
		
		
		
	}


}



 class ContractEmployee extends Employee implements BonusEligibility {                  

	public ContractEmployee(int empId, String name, String designation, double salary) {
		super(empId, name, designation, salary);
		
	}

	@Override
	public void calculateSalary() {
		boolean iseligible =BonusEligibility.isEligibleForBonus(total_Sal);
		if(iseligible) {
			System.out.println("You are eligible for Bonus ");
			total_Sal = salary+20000;
			System.out.println("your total sal is "+total_Sal);
			
		}
		else {
			System.out.println("You are not eligible ");
			total_Sal = salary;
			System.out.println("your total sal is "+total_Sal);
		}
		
	}
	
	
	
	
	public void displayContractEmpDetails() {
		
		System.out.println("Contract Employee Details :  " );
		System.out.println('\n' );
		System.out.println("Employee Id is " + empId );
		System.out.println("Employee name is " + name );
		System.out.println("Employee designation is " + designation );
		System.out.println("Employee salary is " + salary );
		
		System.out.println("=====================================" );
		
		
	}
 }
	
 
 

	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 