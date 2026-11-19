/*
Problem: Elections in Chefland
Platform: CodeChef

Approach:
For each test case, read n and x, then traverse the array.
Count the elements whose value is greater than or equal to x.
Print the count for each test case.

Time Complexity: O(n) per test case
Space Complexity: O(n)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            int count = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] >= x)
                    count++;
            }

            System.out.println(count);

        }
    }
}