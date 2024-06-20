package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
        // Create a HashSet named hs
        HashSet<String> hs = new HashSet<>();

        // Add 6 objects using add() method to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Elderberry");
        hs.add("Fig");

        // Print the size of the HashSet using the size() method
        System.out.println("Size of the HashSet: " + hs.size());

        // Remove an element using the remove() method
        hs.remove("Date");

        // Try to remove an element that is not present in the Set
        boolean isRemoved = hs.remove("Grape");
        System.out.println("Attempt to remove 'Grape' (not present): " + isRemoved);

        // Use the contains() method to check if an item is in the Set or not
        boolean containsItem = hs.contains("Cherry");
        System.out.println("Does the HashSet contain 'Cherry'? " + containsItem);

        // Print the updated set
        System.out.println("Updated HashSet: " + hs);
    }
}