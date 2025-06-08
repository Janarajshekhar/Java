import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter how many number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array before binary search
        Arrays.sort(arr);

        // Input the key to search
        System.out.print("Enter the search element : ");
        int key = sc.nextInt();

        // Binary Search
        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index no.: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
