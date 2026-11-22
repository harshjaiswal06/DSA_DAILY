/*
Problem: Longest Subarray Divisible by K
Platform: GeeksforGeeks (GFG)

Approach:
Traverse the array and consider every starting index.
For each starting index, maintain the running sum and subarray length.
Check whether the current sum is divisible by k.
If it is divisible, update maxLength with the maximum subarray length found.
Continue until all possible subarrays have been checked and return maxLength.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int longestSubarrayDivK(int[] arr, int k) {
        // code here

        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = arr[i];

            int length = 1;

            int start = i + 1;

            while (start < arr.length) {

                if (sum % k == 0) {
                    maxLength = Math.max(length, maxLength);
                }

                sum += arr[start];

                length += 1;

                start += 1;

            }

            if (sum % k == 0) {
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }
}