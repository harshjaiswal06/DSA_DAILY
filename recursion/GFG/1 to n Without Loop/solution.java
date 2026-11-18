
/*
 * Problem: Print 1 to N Without Loop
 * Platform: GeeksforGeeks
 *
 * Approach: Recursion
 *
 * Explanation:
 * Keep calling recursion with n - 1 until n becomes 0.
 * Then print each number while the recursive calls return,
 * producing numbers in ascending order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public void printTillN(int n) {
        recursion(n);
    }

    public void recursion(int n) {
        if (n == 0) return;

        recursion(n - 1);

        System.out.print(n + " ");
    }
}
