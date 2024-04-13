package collection1;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		 Vector<String> vector = new Vector<>();

	        // Adding elements to the Vector
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");
	        vector.add("Apple");

	        // Accessing elements using indexes
	        System.out.println("Element at index 0: " + vector.get(0));
	        System.out.println("Element at index 1: " + vector.get(1));

	        // Iterating through the Vector
	        System.out.println("Elements in the Vector:");
	        for (String element : vector) {
	            System.out.println(element);
	        }

	        // Removing an element
	        vector.remove(0);
	        System.out.println("Vector after removing element at index 0:");
	        for (String element : vector) {
	            System.out.println(element);
	        }

	}

}
