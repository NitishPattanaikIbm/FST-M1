package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
        // Create an ArrayList named myList of type String
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names to the ArrayList using add() method
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eve");

        // Print all the names using for loop
        System.out.println("Names in myList:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Use get() method to retrieve the 3rd name in the ArrayList
        String thirdName = myList.get(2);
        System.out.println("\nThe 3rd name in the list is: " + thirdName);

        // Use contains() method to check if a name exists in the ArrayList
        String nameToCheck = "Charlie";
        boolean containsName = myList.contains(nameToCheck);
        System.out.println("\nDoes myList contain \"" + nameToCheck + "\"? " + containsName);

        // Use size() method to print the number of names in the ArrayList
        int size = myList.size();
        System.out.println("\nNumber of names in the list: " + size);

        // Use remove() method to remove a name from the list and print the size() of the list again
        myList.remove("David");
        System.out.println("\nAfter removing \"David\":");
        System.out.println("Number of names in the list: " + myList.size());
    }
}