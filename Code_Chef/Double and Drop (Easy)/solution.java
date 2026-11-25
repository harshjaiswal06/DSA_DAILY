/*
 * Problem: Double and Drop (Easy)
 * Platform: CodeChef
 *
 * Approach:
 * First, calculate the total sum and maximum element of the original array.
 * If the sum excluding the maximum element equals the maximum element,
 * consider it as a candidate answer.
 *
 * Then, try doubling each element one by one. For each case, calculate
 * the resulting sum and maximum element, and find the sum after removing
 * the maximum element. Keep track of the maximum result.
 *
 * Time Complexity: O(N^2) per test case
 * Space Complexity: O(N)
 */

import java.util.*;

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

            long pmax = Integer.MIN_VALUE;

            int summ = 0;
            int maxx = Integer.MIN_VALUE;
            int c = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                summ += arr[i];
                maxx = Math.max(maxx, arr[i]);
            }

            if (summ - maxx == maxx) {
                c = maxx;
            }

            for (int i = 0; i < n; i++) {

                long sum = 2 * arr[i];

                int max = 2 * arr[i];

                for (int j = 0; j < n; j++) {

                    if (j != i) {
                        sum += arr[j];
                        max = Math.max(max, arr[j]);
                    }
                }

                pmax = Math.max(sum - max, pmax);
            }

            System.out.println(Math.max(c, pmax));
        }
    }
}