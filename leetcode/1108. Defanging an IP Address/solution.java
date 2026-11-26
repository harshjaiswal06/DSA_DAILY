/*
Problem: Defanging an IP Address
Platform: LeetCode
Problem Link: https://leetcode.com/problems/defanging-an-ip-address/

Approach:
Traverse the given IP address character by character.
Whenever a dot ('.') is encountered, replace it with "[.]".
Otherwise, append the character as it is to the result string.

Time Complexity: O(n²) - Due to repeated string concatenation.
Space Complexity: O(n) - For storing the resulting string.
*/

class Solution {
    public String defangIPaddr(String address) {

        String ans="";

        for(int i=0;i<address.length();i++){

            if(address.charAt(i)=='.'){
                ans+="[.]";
                continue;
            }
            ans+=address.charAt(i);
        }
        return ans;
    }
}