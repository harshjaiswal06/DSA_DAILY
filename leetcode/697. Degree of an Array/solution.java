/*
Problem: Degree of an Array
Platform: LeetCode
Problem Link: https://leetcode.com/problems/degree-of-an-array/

Approach:
Use a HashMap to store the frequency, first occurrence, and last occurrence
of each element in an integer array.

For each element:
- If it already exists, increment its frequency and update its last index.
- Otherwise, store its frequency as 1, along with its first and last indices.

Find the maximum frequency (degree) of the array.
Then, among all elements having that frequency, calculate the subarray length
using their first and last occurrence indices and return the minimum length.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, int[]> map = new HashMap<>();

        int maxkey = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int x = 0; x < nums.length; x++) {

            if (map.containsKey(nums[x])) {
                int[] temp = map.get(nums[x]);
                temp[0]++;
                temp[2] = x;
            }
            else {
                map.put(nums[x], new int[]{1, x, x});
            }

            if ((map.get(nums[x])[0]) > maxCount) {
                maxCount = map.get(nums[x])[0];
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int[] x : map.values()) {

            if (x[0] == maxCount) {

                int len = x[2] - x[1] + 1;

                ans = Math.min(ans, len);
            }
        }

        return ans;
    }
}