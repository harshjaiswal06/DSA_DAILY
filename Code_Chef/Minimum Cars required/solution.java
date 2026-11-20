/*
Problem: Minimum Cars Required
Platform: CodeChef

Approach:
Each car can accommodate at most 4 people.
If N is divisible by 4, print N / 4 directly.
Otherwise, repeatedly subtract 4 from N and increment the count
until N becomes 0 or negative. The count gives the minimum
number of cars required.

Time Complexity: O(1) per test case
Space Complexity: O(1)
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

            if (n % 4 == 0) {
                System.out.println(n / 4);
                continue;
            }

            int count = 0;

            while (n > 0) {
                n -= 4;
                count++;
            }

            System.out.println(count);
        }

    }
}