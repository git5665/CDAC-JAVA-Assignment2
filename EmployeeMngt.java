import java.util.ArrayList;

public class EmployeeMngt {
	
	public ArrayList<Employees> addEmployee() {
		
		Employees emp1 = new Employees(1001, "jhonny", "Developer", 20000, 2);
		Employees emp2 = new Employees(1002, "walker", "Manager", 15000, 1);
		
		ArrayList<Employees> arr = new ArrayList<>();
		
		arr.add(emp1);
		arr.add(emp2);
		return arr;
	}
	
	public void updateData(ArrayList<Employees> arr) {
		
		System.out.println("Enter the id for update designation ");
		
		String design = "Cyber speacialist";
		int id = 1001;
		
		for(Employees obj :arr) {
			if(obj.empid==id) {
				System.out.println(obj.desig);
				
			}
				
		}
		
	}
	
	public void deleteEmployee(ArrayList<Employees> arr) {
		System.out.println("Enter the id for delete designation ");
		String design ;
		int id = 1002;
		int pos=0;
		for(Employees obj : arr) {
			if(obj.empid==id) {
				pos = arr.indexOf(obj);
			}
			
		}
		arr.remove(pos);
		System.out.println("given id is removed");
		
	}
	
	public void searchEmp(ArrayList<Employees> arr) {
		
		int id = 1002;
		for(Employees obj :arr) {
			if(obj.empid==id) {
				System.out.println(obj.desig);
			}
			
		}
		
	}
	
	
	
	
	

}
