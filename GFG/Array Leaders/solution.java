/*
Problem: Array Leaders
Platform: GeeksforGeeks (GFG)

Approach:
Traverse the array from right to left.
Maintain the maximum element seen so far, initialized to Integer.MIN_VALUE.
If the current element is greater than or equal to the maximum,
it is a leader, so add it to the ArrayList and update the maximum.
Finally, reverse the ArrayList to return the leaders in their original order.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> ar = new ArrayList<>();

        int min = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (min <= arr[i]) {
                min = arr[i];
                ar.add(arr[i]);
            }

        }

        Collections.reverse(ar);
        return ar;
    }
}