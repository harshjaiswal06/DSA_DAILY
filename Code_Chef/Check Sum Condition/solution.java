
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * Problem: Check Sum Condition
 * Platform: CodeChef
 *
 * Approach: Iteration
 *
 * Explanation:
 * Iterate through numbers from 1 to n-1 and check
 * whether adding a number to its double gives n.
 * If a match is found, print YES; otherwise, print NO.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int y = 0;

        for (int i = 1; i < n; i++) {
            if ((i + (2 * i)) == n) {
                System.out.println("YES");
                y = 1;
                break;
            }
        }

        if (y != 1) {
            System.out.println("NO");
        }
    }
}
