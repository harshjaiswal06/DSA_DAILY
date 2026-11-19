/*
Problem: Largest Element in Array
Platform: GeeksforGeeks (GFG)

Approach:
Initialize a variable m with Integer.MIN_VALUE.
Traverse the array using a for-each loop and update m
whenever a larger element is found using Math.max().
Return m after completing the traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static int largest(int[] arr) {
        // code here
        int m = Integer.MIN_VALUE;

        for (int x : arr) {
            m = Math.max(x, m);
        }

        return m;
    }
}