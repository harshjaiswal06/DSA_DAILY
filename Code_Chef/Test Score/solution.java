/*
Problem: Test Score
Platform: CodeChef

Approach:
For each test case, read n, x, and y.
If y is 0, print YES immediately.
Otherwise, check all possible values of i from 0 to n.
Calculate i * x and check whether it equals y.
If a match is found, set flag to 1 and print YES.
Otherwise, print NO.

Time Complexity: O(n) per test case
Space Complexity: O(1)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int x = sc.nextInt();

            int y = sc.nextInt();

            int i = 0;

            int flag = 0;

            if (y == 0) {
                System.out.println("YES");
                continue;
            }

            while (i <= n) {

                int sum = i * x;

                if (sum == y) {
                    flag = 1;
                    break;
                }

                i++;

            }

            if (flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}