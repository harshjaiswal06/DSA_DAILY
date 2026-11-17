/*
Problem: Calculate Digit Sum of a String
Platform: LeetCode

Approach:
- Repeat the process while the string length is greater than k.
- Divide the string into groups of k characters.
- Calculate the sum of digits in each group.
- Append each group's sum to a temporary string.
- Replace the original string with the newly generated string.
- Return the final string when its length becomes less than or equal to k.

Time Complexity: O(N log K N)
Space Complexity: O(N)
*/

class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k) {

            String temp = "";

            for(int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for(int j = i; j < k + i && j < s.length(); j++) {

                    if(j == k + i) break;

                    sum += s.charAt(j) - '0';
                }

                temp += String.valueOf(sum);
            }

            s = temp;
        }

        return s;
    }
}