/*
Problem: Fibonacci Number
Platform: LeetCode
Link: https://leetcode.com/problems/fibonacci-number/

Approach:

* Use Dynamic Programming with Memoization (Top-Down).
* Initialize the dp array with -1 to mark uncomputed values.
* Calculate Fibonacci numbers recursively.
* Store computed results in dp to avoid repeated calculations.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Arrays;

class Solution {
public int fib(int n) {

```
    int[] dp = new int[n + 1];

    Arrays.fill(dp, -1);

    // n + 1 because array indexing starts from 0.

    return recursion(n, dp);
}

public int recursion(int n, int[] dp) {

    if (n == 0) return 0;

    if (n == 1) return 1;

    if (dp[n] != -1) return dp[n];

    dp[n] = recursion(n - 1, dp) + recursion(n - 2, dp);

    return dp[n];
}
```

}
