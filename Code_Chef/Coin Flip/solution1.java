/*
 * Problem: Coin Flip
 * Platform: CodeChef
 * Approach: Recursion (Fibonacci Pattern)
 * Time Complexity: O(2^N)
 * Space Complexity: O(N)
 *
 * Explanation:
 * Use recursion to calculate the result.
 * The base cases return 1 when N is 0 or 1.
 * For other values, calculate the sum of the results
 * for N-1 and N-2.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(recursion(n));
    }

    public static int recursion(int n) {

        if (n == 0) return 1;

        if (n == 1) return 1;

        int k = recursion(n - 1);
        int j = recursion(n - 2);

        return k + j;
    }
}
