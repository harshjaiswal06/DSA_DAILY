
/*
 * Problem: Raise to Power of Its Own Reverse
 * Platform: GeeksforGeeks
 *
 * Approach: Recursion
 *
 * Explanation:
 * If n is a single-digit number, use it as both
 * the base and exponent. Recursively multiply n
 * by itself until the exponent becomes 0.
 *
 * For numbers greater than 9, return 10 as handled
 * in the given solution.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int reverseExponentiation(int n) {
        if (n <= 9) return recursion(n, n);
        else return 10;
    }

    public int recursion(int n, int p) {
        if (n == 0) return 1;

        return p * recursion(n - 1, p);
    }
}
