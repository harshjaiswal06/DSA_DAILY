/*
Problem: Climbing Stairs
Platform: LeetCode
Link: https://leetcode.com/problems/climbing-stairs/

Approach:

* Use Dynamic Programming with Memoization (Top-Down).
* Base cases: return 1 when n = 0 or n = 1.
* Calculate the total ways by adding the results of n - 1 and n - 2.
* Store computed results in dp to avoid repeated calculations.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Arrays;

class Solution {
public int climbStairs(int n) {

    int[] dp = new int[n + 1];

    Arrays.fill(dp, -1);

    return recursion(n, dp);
}

public int recursion(int n, int[] dp) {

    if (n == 0) return 1;

    if (n == 1) return 1;

    if (dp[n] != -1) return dp[n];

    // Total paths = paths from n - 1 + paths from n - 2.

    return dp[n] = recursion(n - 1, dp) + recursion(n - 2, dp);
}


}

  // because two edges cases like when 0-1 0-2 so it will create a problem else if 1-1 no prolme but for 1-2 will create a problem so we have to handle it alsp 

