
/*
 * Problem: Minimum Number of Flips
 * Platform: CodeChef
 * Approach: Counting and Greedy
 * Time Complexity: O(N) per test case
 * Space Complexity: O(N) per test case
 *
 * Explanation:
 * Count the number of positive and non-positive elements.
 * If N is odd, print -1.
 * If the positive and non-positive counts are equal, print 0.
 * Otherwise, calculate the difference between N/2 and
 * the number of positive elements to find the minimum flips.
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            int count = 0;
            int min = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] > 0) {
                    count++;
                } else {
                    min++;
                }
            }

            if (n % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            if (count == min) {
                System.out.println(0);
                continue;
            }

            int target = n / 2;

            System.out.println(Math.abs(target - count));
        }

        sc.close();
    }
}