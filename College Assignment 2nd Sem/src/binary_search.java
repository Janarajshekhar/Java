import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter how many number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array before binary search
//        Arrays.sort(arr);
//        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Input the key to search
        System.out.print("Enter the search element : ");
        int k = sc.nextInt();

        int index = binarySearch(arr, k);

        if (index != -1) {
            System.out.println("Element found at index no.: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }

    // Binary search method
    public static int binarySearch(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}