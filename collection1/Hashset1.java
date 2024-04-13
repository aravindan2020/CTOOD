package collection1;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		// Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Adding a duplicate element
        hashSet.add("Apple");

        // Iterating through the HashSet
        System.out.println("Elements in the HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana':");
        for (String element : hashSet) {
            System.out.println(element);
        }

	}

}
