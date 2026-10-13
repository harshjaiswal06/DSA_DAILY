/*
Problem: Climbing Stairs
Platform: LeetCode
Link: https://leetcode.com/problems/climbing-stairs/

Approach:

* Use Dynamic Programming (Tabulation).
* Initialize dp[0] = 1 and dp[1] = 1.
* For each step i, calculate dp[i] = dp[i - 1] + dp[i - 2].
* Return dp[n].

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
public int climbStairs(int n) {


    int[] dp = new int[n + 1];

    dp[0] = 1;
    dp[1] = 1;

    // Handle the base cases before calculating further steps.

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
}

}
