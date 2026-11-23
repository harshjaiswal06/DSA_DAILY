/*
Problem: Reverse Array
Platform: GeeksforGeeks
Approach: Two-Pointer Swapping
Time Complexity: O(n)
Space Complexity: O(1)

Explanation:
Use two pointers, one at the beginning and one at the end.
Swap the elements at both pointers and move them towards
the center until the pointers meet or cross each other.
*/

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i = 0, high = arr.length - 1;

        while (i < high) {

            int temp = arr[i];

            arr[i] = arr[high];

            arr[high] = temp;

            i++;
            high--;
        }
    }
}