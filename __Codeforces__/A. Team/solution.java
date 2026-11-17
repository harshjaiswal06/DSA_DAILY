
/*
Problem: A. Team
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/231/A

Approach:
1. Read the number of problems (n).
2. For each problem, read the confidence values of Petya, Vasya, and Tonya.
3. Calculate their sum.
4. If the sum is greater than or equal to 2, increment the count.
5. Print the total count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a + b + c;

            if (sum >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
