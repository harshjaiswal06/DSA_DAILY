
import java.util.*;

/*
 * Problem: Third Maximum Number
 * Platform: LeetCode
 *
 * Approach: Sorting and Array Traversal
 *
 * Explanation:
 * Sort the array and identify distinct maximum values.
 * Replace already selected maximum values with Integer.MIN_VALUE
 * to find the next distinct maximum.
 * If fewer than three distinct numbers exist, return
 * the overall maximum.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) auxiliary space
 */

class Solution {
    public int thirdMax(int[] arr) {

        int distinct = 3;
        int count = 0;
        int l = arr.length;
        int n = 2;
        int py = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int prev = arr[i];

            if (prev < 0) py++;

            int y = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == prev) {
                    y++;
                }
            }

            if ((l - y) >= n) {
                l = l - y;
                count++;
                n -= 1;
            }
        }

        int ans = 0;

        System.out.println(py);

        if (count < 3) {
            System.out.println("in");
            Arrays.sort(arr);

            if (py == 0) return arr[arr.length - 1];
            else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (arr[i] != 0) return arr[i];
                }
            }
        }

        while (distinct != 0) {
            distinct--;

            Arrays.sort(arr);

            ans = arr[arr.length - 1];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ans) {
                    arr[i] = Integer.MIN_VALUE;
                }
            }
        }

        return ans;
    }
}
