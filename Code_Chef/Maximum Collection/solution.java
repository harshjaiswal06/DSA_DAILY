
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * Problem: Maximum Collection
 * Platform: CodeChef
 *
 * Approach: Nested Loops and Array Traversal
 *
 * Explanation:
 * Try every pair of adjacent elements and calculate
 * their combined half values. Add the remaining elements
 * to get the total collection for that pair.
 * Keep track of the maximum total obtained.
 *
 * Time Complexity: O(n^2) per test case
 * Space Complexity: O(n)
 */

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (arr.length == 2) {
                System.out.println((arr[0] / 2) + (arr[1] / 2));
                continue;
            }

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length - 1; i++) {

                int todaycollection = (arr[i] / 2) + (arr[i + 1] / 2);

                int sum = 0;

                for (int j = 0; j < arr.length; j++) {

                    if (j == i || j == i + 1) continue;

                    sum += arr[j];
                }

                if ((sum + todaycollection) > max) {
                    max = sum + todaycollection;
                }
            }

            System.out.println(max);
        }
    }
}
