
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * Problem: Count Consecutive Character Groups
 * Platform: CodeChef
 *
 * Approach: Linear Traversal
 *
 * Explanation:
 * Traverse the string and count how many groups of
 * consecutive identical characters are present.
 * Whenever the current character differs from the
 * previous group, increment the count.
 * If the total groups are within k, print YES;
 * otherwise, print NO.
 *
 * Time Complexity: O(n) per test case
 * Space Complexity: O(n)
 */

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            char[] arr = new char[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.charAt(i);
            }

            int count = 1;
            char current = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (current != arr[i]) {
                    current = arr[i];
                    count++;
                }
            }

            if (count <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
