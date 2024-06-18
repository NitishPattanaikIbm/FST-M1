package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        // Initialize an array with numbers in random order
        int[] array = {5, 2, 9, 1, 5, 6};

        // Display the array before sorting
        System.out.println("Array before sorting: " + Arrays.toString(array));

        // Perform insertion sort
        insertionSort(array);

        // Display the array after sorting
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

    // Insertion sort method
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}