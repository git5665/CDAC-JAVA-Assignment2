package Java;

import java.util.Scanner;
public class ShowMainData {
	public static void main(String arg[]) {
		int id;
		String name;
		float marks;
		String result;
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter student ID here : ");
		id = scn.nextInt();
		scn.nextLine();
		
		System.out.println("Enter student name here : ");
		name = scn.nextLine();
		
		
		System.out.println("Enter student marks here : ");
		marks = scn.nextFloat();
		
		Student st = new Student();
		st.Initialize(id, name, marks);
		
		
		st.displayStdDetails();
		
		
	}

}
