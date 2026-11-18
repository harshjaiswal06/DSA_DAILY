
/*
 * Problem: Recursively Sum N Numbers
 * Platform: GeeksforGeeks
 *
 * Approach: Recursion
 *
 * Explanation:
 * Add n to the sum of numbers from 1 to n-1.
 * Keep reducing n until it reaches 0, which is
 * the base case and returns 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int recursiveSum(int n) {
        return recursion(n);
    }

    public int recursion(int n) {
        if (n == 0) return 0;

        return n + recursion(n - 1);
    }
}
