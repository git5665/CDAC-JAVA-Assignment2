import java.util.ArrayList;

public class Employees {
		int empid; 
		String name; 
		String desig;
		double salary; 
		int exp;
		
		
		public Employees(int empid, String name, String desig, double salary, int exp) {
			
			this.empid = empid;
			this.name = name;
			this.desig = desig;
			this.salary = salary;
			this.exp = exp;
		} 
		
		void display() {
			System.out.println(empid+" "+name+" "+desig+" "+salary+" "+exp);
		}
		
	
}
