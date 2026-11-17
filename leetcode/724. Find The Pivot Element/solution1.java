
/*
Problem: Find Pivot Index
Platform: LeetCode
Problem Link: https://leetcode.com/problems/find-pivot-index/

Approach:
1. Iterate through each index of the array.
2. Calculate the sum of all elements to its left.
3. Calculate the sum of all elements to its right.
4. If both sums are equal, return the current index.
5. If no pivot index is found, return -1.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int sumw = 0;

            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                sumw += nums[j];
            }

            if (sum == sumw) {
                return i;
            }
        }

        return -1;
    }
}
