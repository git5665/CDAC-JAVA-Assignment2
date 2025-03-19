package NewAssign1;

import java.util.Scanner;

public class Player {
	String name;
	int age;
	String country_Name;
	int total_Run ;
	

	public Player(String name,int age,String country_Name,int total_Run) {
		
		this.name = name;
		this.age = age;
		this.country_Name = country_Name;
		this.total_Run = total_Run;
		
	}
	
	
	
	
	public void displayDetails() {
		
		if(total_Run>=5000)
		{
		System.out.println("Player name is " + name);
		System.out.println("Player age is " + age);
		System.out.println("Player country_Name is " + country_Name);
		System.out.println("Player total_run is " + total_Run);
		}
	}
	
	public void totalRun() {
		
		
		
	}
	
	

	
	
}
