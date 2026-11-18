
/*
 * Problem: Print N to 1 Without Loop
 * Platform: GeeksforGeeks
 *
 * Approach: Recursion
 *
 * Explanation:
 * Print the current number before making the recursive call.
 * Keep decreasing n by 1 until it reaches 0.
 * This prints numbers in descending order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public void printNos(int n) {
        recursion(n);
    }

    public void recursion(int n) {
        if (n == 0) return;

        System.out.print(n + " ");

        recursion(n - 1);
    }
}
