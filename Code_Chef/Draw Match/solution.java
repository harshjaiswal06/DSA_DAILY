
/*
 * Problem: Draw Match
 * Platform: CodeChef
 * Approach: Conditional Comparison
 * Time Complexity: O(T)
 * Space Complexity: O(1)
 *
 * Explanation:
 * Read the number of test cases T.
 * For each test case, read two integers n and n2.
 * If n is not zero, compare n with n2.
 * Print "YES" if they are equal; otherwise, print "NO".
 * If n is zero, print "NO".
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int n2 = sc.nextInt();

            if (n != 0) {
                System.out.println(n == n2 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
