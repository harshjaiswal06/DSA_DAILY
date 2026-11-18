
/*
 * Problem: Power Using Recursion
 * Platform: GeeksforGeeks
 *
 * Approach: Recursion
 *
 * Explanation:
 * Multiply p recursively n times to calculate p^n.
 * Reduce n by 1 in each call until it reaches 0,
 * where the base case returns 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int recursivePower(int n, int p) {
        return recursion(n, p);
    }

    public int recursion(int n, int p) {
        if (n == 0) return 1;

        return recursion(n - 1, p) * p;
    }
}
