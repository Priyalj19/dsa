
// Create an array size 10 of integers, add 8 values in it , sort the numbers, after sorting 
// accept 2 more numbers from user one by one and add it in the array, using insertion 
sort.public import java.util.Scanner;

public class InsertionSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];   // array of size 10
        int n = 0;                 // number of elements currently in array

        // Step 1: Accept 8 values
        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
            n++;
        }

        // Step 2: Sort the first 8 values
        insertionSort(arr, n);

        System.out.println("Array after sorting 8 values:");
        printArray(arr, n);

        // Step 3: Accept 2 more numbers one by one and insert them
        for (int k = 0; k < 2; k++) {
            System.out.println("Enter number " + (k + 1) + ":");
            int newVal = sc.nextInt();
            arr[n] = newVal;  // place at end temporarily
            n++;
            insertionSort(arr, n); // sort again with new size
            System.out.println("Array after inserting " + newVal + ":");
            printArray(arr, n);
        }

        sc.close();
    }

    // Standard insertion sort
    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Utility to print array
    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
 insertionsort {
    
}
