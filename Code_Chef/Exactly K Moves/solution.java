/*
 * Problem: Exactly K Moves
 * Platform: CodeChef
 *
 * Approach:
 * If N is greater than or equal to K and less than or equal to 2*K,
 * print YES. Otherwise, print NO.
 *
 * Time Complexity: O(1) per test case
 * Space Complexity: O(1)
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n >= k && n <= 2 * k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}