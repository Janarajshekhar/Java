import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter how many number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter the search element : ");
        int k = sc.nextInt();

        // Linear Search
        boolean found =false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println("Element found at index no. : " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
