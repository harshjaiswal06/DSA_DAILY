/*
 * Problem: Find the First Occurrence of an Element Using Recursion
 * Platform: Practice
 *
 * Approach:
 * Check the current array element. If it matches the target, return its index.
 * If the end of the array is reached, return -1. Otherwise, recursively
 * check the next index.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) - recursion call stack
 */

public class FirstRecursion {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 1, 5, 6, 4, 2, 23, 4322, 321};
        int item = 5;

        System.out.println(recursion(arr, item, 0));
    }

    public static int recursion(int[] arr, int item, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == item) {
            return i;
        }

        return recursion(arr, item, i + 1);
    }
}
