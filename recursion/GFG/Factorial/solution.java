
/*
 * Problem: Factorial
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Recursion
 *
 * Explanation:
 * Calculate factorial by recursively multiplying n
 * with the factorial of (n - 1).
 * Base case: 0! = 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) - Recursion Stack
 */

class Solution {
    int factorial(int n) {
        return recursion(n);
    }

    public static int recursion(int n) {
        if (n == 0) return 1;

        return n * recursion(n - 1);
    }
}
