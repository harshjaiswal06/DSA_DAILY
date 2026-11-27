/*
Problem: GCD of Two Numbers
Platform: GeeksforGeeks
Problem Link: https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

Approach:
First, compare the two numbers and pass the larger number as a
and the smaller number as b to the HCF function.

Using the Euclidean Algorithm:
- If a % b == 0, then b is the GCD.
- Otherwise, recursively call gcd(b, a % b).

Repeat until the remainder becomes 0.

Time Complexity: O(log(min(a, b)))
Space Complexity: O(log(min(a, b))) - due to recursive call stack.
*/

class Solution {
    public static int gcd(int a, int b) {
        // code here

        if(a>b){

            return hcf(a,b);
        }
        else{
            return hcf(b,a);
        }
    }

    public static int hcf(int a,int b){

        if(a%b==0){
            return b;
        }

        return gcd(b,a%b);
    }
}