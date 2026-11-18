
/*
 * Problem: Count Digits in Number
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Recursion
 *
 * Explanation:
 * Recursively divide the number by 10 to remove its
 * last digit and increment the count.
 * When n becomes 0, return the total count.
 * Handle n = 0 separately as it contains one digit.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(log10(n)) - Recursion Stack
 */

class Solution {
    public int countDigits(int n) {
        if (n == 0) return 1;

        return recursion(n, 0);
    }

    public static int recursion(int n, int count) {
        if (n == 0) return count;

        return recursion(n / 10, count + 1);
    }
}
