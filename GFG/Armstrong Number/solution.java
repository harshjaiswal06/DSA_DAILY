/*
Problem: Armstrong Number
Platform: GeeksforGeeks

Approach:
- Store the original number in p.
- Calculate the number of digits using log10.
- Extract each digit using modulo 10.
- Raise each digit to the power of the number of digits and add it to sum.
- Compare the final sum with the original number.

Time Complexity: O(D)
Space Complexity: O(1)
where D is the number of digits in n.
*/

class Solution {
    public boolean armstrongNumber(int n) {
        // code here

        int p=n;

        int n1=((int)Math.log10(n))+1;

        int sum=0;

        while(n!=0){

            int d=n%10;

            sum+=Math.pow(d,n1);

            n=n/10;
        }
        return sum==p?true:false;
    }
}