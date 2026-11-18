
import java.util.*;

/*
 * Problem: First n Fibonacci Numbers
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Recursion (Tail Recursion)
 *
 * Explanation:
 * Use two variables f1 and f2 to generate Fibonacci
 * numbers recursively.
 *
 * Add f1 to the ArrayList in every recursive call.
 * Update f1 = f2 and f2 = f1 + f2.
 *
 * Base Case:
 * When n becomes 0, stop the recursion.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) - Recursion Stack
 */

class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        recursion(0, 1, arr, n);

        return arr;
    }

    public static void recursion(int f1, int f2, ArrayList<Integer> arr, int n) {
        if (n == 0) return;

        arr.add(f1);

        recursion(f2, f1 + f2, arr, n - 1);
    }
}
