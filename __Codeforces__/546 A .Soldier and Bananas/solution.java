/*
Problem: Soldier and Bananas
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/546/A

Approach:
Calculate the total cost of buying w bananas, where the price of the
first banana is k, the second is 2k, the third is 3k, and so on.

Use a loop to calculate the total cost.
Subtract the dollars the soldier already has (n) from the total cost.
If the result is positive, print the amount he needs to borrow.
Otherwise, print 0.

Time Complexity: O(w)
Space Complexity: O(1)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in) ;

        int k=sc.nextInt();//banana price

        int n=sc.nextInt();//dollar he has

        int w=sc.nextInt();//no. of banana he wants to buy

        int sum=0;

        while(w>0){
            sum+=w*k;
            w=w-1;
        }

        System.out.println((sum-n)>0?sum-n:0);

    }
}