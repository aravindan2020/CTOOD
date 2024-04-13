package collection1;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// Creating a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(998, "Apple");
        hashMap.put(1002, "Banana");
        hashMap.put(1008, "Orange");

        // Adding a duplicate key
        hashMap.put(1, "Mango");

        // Accessing values using keys
        System.out.println("Value for key 1: " + hashMap.get(998));
        System.out.println("Value for key 2: " + hashMap.get(1002));

        // Iterating through the HashMap
        System.out.println("Key-value pairs in the HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Removing a key-value pair
        hashMap.remove(1008);
        System.out.println("HashMap after removing key 3:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

	}

}
