
import java.util.Scanner;

// First class: contains logic to find max and min
class ArrayOperations {
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

// Second class: handles input/output and calls methods
public class find_max_min_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create object of ArrayOperations
        ArrayOperations ao = new ArrayOperations();

        // Get and print results
        int max = ao.findMax(numbers);
        int min = ao.findMin(numbers);

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
