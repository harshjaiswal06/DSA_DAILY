
/*
Problem: Odd or Even
Platform: GeeksforGeeks

Approach:
1. Check whether n is divisible by 2 using the modulo operator (%).
2. If n % 2 == 0, return true (Even).
3. Otherwise, return false (Odd).

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
