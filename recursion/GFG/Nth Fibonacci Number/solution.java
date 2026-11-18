
/*
 * Problem: Nth Fibonacci Number
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Recursion (Tail Recursion)
 *
 * Explanation:
 * Use two variables f1 and f2 to store consecutive
 * Fibonacci numbers.
 *
 * In each recursive call:
 * - Update f1 with f2.
 * - Update f2 with f1 + f2.
 * - Increment the current position.
 *
 * Base Case:
 * When the current position equals the target,
 * return f1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) - Recursion Stack
 */

class Solution {
    static int nthFibonacci(int n) {
        return recursion(0, 1, n, 0);
    }

    public static int recursion(int f1, int f2, int target, int n) {
        if (n == target) return f1;

        return recursion(f2, f1 + f2, target, n + 1);
    }
}
