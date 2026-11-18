
/*
 * Problem: Sum of Array
 * Platform: GeeksforGeeks
 *
 * Approach: Array Traversal
 *
 * Explanation:
 * Traverse the array using an enhanced for loop and
 * add each element to sum. Return the total after
 * processing all elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int arraySum(int arr[]) {
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        return sum;
    }
}
