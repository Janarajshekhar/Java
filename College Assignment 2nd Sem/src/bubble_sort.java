import java.util.Scanner;

public class bubble_sort {

    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            // Optimization: skip unnecessary passes if already sorted
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping happened in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call sorting method
        bubbleSort(arr);

        // Display sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}
