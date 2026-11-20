/*
Problem: Maximum Product of Three Numbers
Platform: LeetCode
Problem Link: https://leetcode.com/problems/maximum-product-of-three-numbers/

Approach:
Sort the array in ascending order.
Calculate the product of the three largest elements.
Also calculate the product of the largest element and the two smallest elements,
because two negative numbers can produce a positive product.
Return the maximum of these two products.

Time Complexity: O(n log n)
Space Complexity: O(1) auxiliary space (sorting)
*/

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {

        int sum = 1;

        Arrays.sort(nums);

        int m = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        int n = nums[nums.length - 1] * nums[0] * nums[1];

        return Math.max(m, n);
    }
}