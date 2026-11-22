/*
Problem: Jenga Night
Platform: CodeChef

Approach:
For each test case, read p and j.
If j is greater than or equal to p, check whether either p divides j
or j divides p exactly.
If either condition is true, print YES; otherwise, print NO.
If j is less than p, print NO directly.

Time Complexity: O(1) per test case
Space Complexity: O(1)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int p = sc.nextInt();

            int j = sc.nextInt();

            if (j >= p) {

                if (p % j == 0 || j % p == 0)
                    System.out.println("YES");

                else
                    System.out.println("NO");
            }

            else
                System.out.println("NO");
        }

    }
}