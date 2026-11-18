
import java.util.*;

/*
 * Problem: Factorials in Array
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Iteration
 *
 * Explanation:
 * Traverse the given array and check whether each
 * element is a factorial number.
 *
 * The checking() method calculates factorials
 * iteratively and compares them with the given number.
 * If a match is found, return true.
 *
 * Time Complexity: O(N * M)
 * Space Complexity: O(N)
 *
 * N = Size of the input array
 * M = Maximum value in the array
 */

class Solution {
    public List<Integer> factorialNumbers(List<Integer> ar) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < ar.size(); i++) {
            if (checking(ar.get(i))) {
                arr.add(ar.get(i));
            }
        }

        return arr;
    }

    public static boolean checking(int n) {
        int uy = 1;

        for (int i = 1; i <= n; i++) {
            uy = uy * i;

            if (n == uy) return true;
            else if (uy > n) break;
        }

        return false;
    }
}
