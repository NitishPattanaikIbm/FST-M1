package activities;

public class Activity2 {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        // Call the method to check the sum of 10's
        boolean result = checkSumOfTens(numbers);

        // Print the result
        System.out.println("Result: " + result);
    }

    // Method to check if the sum of all 10's in the array is exactly 30
    public static boolean checkSumOfTens(int[] numbers) {
        int sum = 0;

        // Iterate through the array
        for (int num : numbers) {
            // If the number is 10, add it to the sum
            if (num == 10) {
                sum += num;
            }
        }

        // Check if the sum is exactly 30
        return sum == 30;
    }
}