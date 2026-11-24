/*
Problem: Subarray Sum Equals K
Platform: LeetCode
Approach: Brute Force (Nested Loops + Running Sum)
Time Complexity: O(n^2)
Space Complexity: O(1)

Explanation:
Start a subarray from every index.
Maintain a running sum while extending the subarray.
Whenever the sum equals k, increment the count.
Return the total number of subarrays whose sum equals k.
*/

class Solution {
    public int subarraySum(int[] arr, int k) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            if (k == 0 && arr.length < 1) {
                break;
            }

            else {
                for (int j = i; j < arr.length; j++) {

                    sum += arr[j];

                    if (sum == k) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}