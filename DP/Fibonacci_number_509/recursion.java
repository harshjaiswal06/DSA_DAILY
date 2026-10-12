/*
Problem: Fibonacci Number
Platform: LeetCode
Link: https://leetcode.com/problems/fibonacci-number/

Approach:

* Use recursion to calculate Fibonacci numbers.
* Base cases: return 0 for n = 0 and 1 for n = 1.
* Calculate each result by adding recursion(n - 1) and recursion(n - 2).

Time Complexity: O(2^n)
Space Complexity: O(n)
*/

class Solution {
public int fib(int n) {

```
    return recursion(n);
}

public int recursion(int n) {

    if (n == 0) return 0;

    if (n == 1) return 1;

    return recursion(n - 1) + recursion(n - 2);
}
```

}
