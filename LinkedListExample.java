package Java;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String arg[]) {
		
	
	
	LinkedList<Integer> ll = new LinkedList<>();
	
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	ll.add(60);
	ll.add(70);
	
	for(Integer ele :ll) {
		System.out.println(ele);
	}
	
	
	System.out.println("----------------------------------------------");
	
	
	ll.addFirst(5);
	for(Integer ele :ll) {
		System.out.println(ele);
	}
	
	System.out.println("----------------------------------------------");
	
	
	
	ll.addLast(21);
	for(Integer ele :ll) {
		System.out.println(ele);
	
	
	
	}
	
	System.out.println("----------------------------------------------");
	
	ll.add(3, 33); // this method make space of itself in between linked list
	for(Integer ele :ll) {
		System.out.println(ele);
	
	}
	System.out.println("----------------------------------------------");
	
	 ll.remove(3);
	 
	 for(Integer ele :ll) {
		 System.out.println(ele);
	 }
	 
	 System.out.println("----------------------------------------------");
	 
	 
	 ll.set(5, 55);         // set() method is used for updating value at any index in linked list
	 for(Integer ele :ll) {
		 System.out.println(ele);
	 }
	
	
	
	
	
	
	
	}

}
