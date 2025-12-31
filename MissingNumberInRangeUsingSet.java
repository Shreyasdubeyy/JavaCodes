

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumberInRangeUsingSet {

    public static void main(String[] args) {

        // Using Scanner for console-based input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the value of n
        System.out.println("Enter the value of n:(range from 1 to n)");
        int n = scanner.nextInt();

        // Edge case: invalid range
        if (n <= 0) {
            System.out.println("Invalid range");
            scanner.close();
            return;
        }

        // Ask user for number of elements present (should be n - 1)
        System.out.println("Enter number of elements present:");
        int size = scanner.nextInt();

        // Read the elements into an array
        int[] numbers = new int[size];
        System.out.println("Enter the elements:");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        // Find the missing number
        int missingNumber = findMissingNumber(numbers, n);

        // Display result
        System.out.println("Missing number is: " + missingNumber);

        // Close scanner to release system resources
        scanner.close();
    }

    /**
     * Finds the missing number from the range 1 to n using a Set.
     */
    static int findMissingNumber(int[] numbers, int n) {

        // Input validation
        if (numbers == null || numbers.length == 0) {
            return 1;
        }

        // HashSet allows O(1) lookup for presence checking
        Set<Integer> numberSet = new HashSet<>();

        // Add all present numbers to the set
        for (int number : numbers) {
            numberSet.add(number);
        }

        // Check which number from 1 to n is missing
        for (int value = 1; value <= n; value++) {
            if (!numberSet.contains(value)) {
                return value;
            }
        }

        // If no number is missing, return -1 as a safe fallback
        return -1;
    }
}

