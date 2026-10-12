/*
Problem: Fibonacci Number
Platform: LeetCode
Link: https://leetcode.com/problems/fibonacci-number/

Approach:

* Use Dynamic Programming (Tabulation).
* Initialize dp[0] = 0 and dp[1] = 1.
* Calculate each Fibonacci number using the previous two values.
* Return dp[n].

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
public int fib(int n) {


    if (n <= 1) return n;

    int[] dp = new int[n + 1];

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
}


}
