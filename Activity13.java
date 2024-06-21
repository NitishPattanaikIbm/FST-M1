package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	

	    public static void main(String[] args) {
	        // Create a Scanner object named scan
	        Scanner scan = new Scanner(System.in);

	        // Create an ArrayList object named list
	        ArrayList<Integer> list = new ArrayList<>();

	        // Create a Random class object named indexGen
	        Random indexGen = new Random();

	        // Prompt the user to enter integer values
	        System.out.println("Enter integer values (type a non-integer to stop):");

	        // Add a scan statement with nextInt() to accept only integer values, inside a loop
	        while (scan.hasNextInt()) {
	            int value = scan.nextInt();
	            list.add(value);
	        }

	        // Convert the ArrayList into an array
	        Integer[] nums = list.toArray(new Integer[0]);

	        // Ensure the array is not empty
	        if (nums.length == 0) {
	            System.out.println("No integers were entered.");
	        } else {
	            // Use indexGen to generate an integer value with the bounds set to the length of nums array
	            int randomIndex = indexGen.nextInt(nums.length);

	            // Print the index value that was generated and the value in the array at that index value
	            System.out.println("Generated index: " + randomIndex);
	            System.out.println("Value at generated index: " + nums[randomIndex]);
	        }

	        // Close the Scanner object
	        scan.close();
	    }
	}
