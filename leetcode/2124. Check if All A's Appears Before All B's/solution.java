/*
Problem: Check if All A's Appear Before All B's
Platform: LeetCode
Problem Link: https://leetcode.com/problems/check-if-all-a-s-appear-before-all-b/

Approach:
Count the total number of 'b' characters in the string.
Then traverse the string from right to left and decrement the count
for every consecutive 'b' encountered.
Stop when a character other than 'b' is found.
If the count becomes 0, all 'b' characters are positioned correctly
after the 'a' characters, so return true. Otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean checkString(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'b')
                count++;

        }

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == 'b') {

                count--;

            }
            else {
                break;
            }
        }

        if (count == 0)
            return true;

        return false;
    }
}