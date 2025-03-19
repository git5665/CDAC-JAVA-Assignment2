package NewAssign1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(15);
		arr.add(20);
		arr.add(81);
		arr.add(45);
		for(Integer obj :arr) {
		System.out.println(obj);
		
	}
		System.out.println("-------------------------");
		
		arr.remove(3);
		for(Integer obj:arr) {
			System.out.println(obj);
		}
		System.out.println("-------------------------");
		 
		arr.set(3, 54);
		for(Integer obj :arr) {
			System.out.println(obj);
		}
		System.out.println("-------------------------");
		
		arr.add(21);
		arr.add(27);
		arr.add(39);
		arr.add(99);
		
		for(Integer obj :arr) {
			System.out.println(obj);
		}
		System.out.println("-------------------------");
		
		//arr.get(7);
		
		Integer obj = arr.get(7);   //this is the correct method to get an particular value
		System.out.println(obj);  // get() it is the method and we can call the value by using (Classname.methodname) 
		System.out.println("-------------------------");// if method is non-static then we have to create reference of the class first
 		
//		int age = 10;
//		System.out.println(age);
		 
		Collections.sort(arr);  // need to remember this sorting method
		System.out.println(arr);
		
		
	}

	
	
}
