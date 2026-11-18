
/*
 * Problem: Sum of Digits
 * Platform: GeeksforGeeks
 *
 * Approach: Recursion
 *
 * Explanation:
 * Extract the last digit using n % 10 and add it to sum.
 * Remove the last digit using n / 10 and repeat recursively
 * until n becomes 0.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(log10(n))
 */

class Solution {
    static int sumOfDigits(int n) {
        return recursion(n, 0);
    }

    public static int recursion(int n, int sum) {
        if (n == 0) return sum;

        sum += n % 10;

        return recursion(n / 10, sum);
    }
}
