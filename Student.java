package Java;

public class Student {
	
	int id;
	String name;
	float marks;
	String result;
	
	
	

	public void Initialize(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		findResult();
		
		
	}
	
	public void findResult() {
		if(marks >=50) {
			result = "pass";
		}
		else {
			result = "Fail";
		}
		
	}
	
	public void displayStdDetails() {
		System.out.println("Student id - "+id);
		System.out.println("Student name - "+name);
		System.out.println("Student marks - "+marks);
		System.out.println("Student result is  - " + result);
	}
	
	

}
