/*
 * Problem: Count
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Calculate the number of possible pairs using N * (N - 1) / 2.
 * Use this value as the exponent of 2 and return 2 raised to that power.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {
    static long count(int n) {
        // code here

        long g = 2;

        int h = (((n * (n - 1)) / 2));

        return (long) Math.pow(g, h);
    }
}