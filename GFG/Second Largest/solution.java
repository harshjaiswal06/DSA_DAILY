/*
Problem: Second Largest
Platform: GeeksforGeeks (GFG)

Approach:
Initialize max with the first element and secondmax with 0.
Traverse the array and update max and secondmax accordingly.
If a new maximum is found, the previous maximum becomes secondmax.
Otherwise, update secondmax if the current element is greater than
secondmax and is not equal to max.
Return secondmax if it is distinct from max and non-zero; otherwise return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];

        int secondmax = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }

        if (max != secondmax && secondmax != 0)
            return secondmax;

        return -1;
    }
}