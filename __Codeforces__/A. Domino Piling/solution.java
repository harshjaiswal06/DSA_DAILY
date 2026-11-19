/*
Problem: Domino Piling
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/50/A

Approach:
Calculate the total number of cells in the m × n rectangle.
Each domino covers 2 cells, so divide the total area by 2.
If the total area is odd, subtract 1 before dividing.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        if ((m * n) % 2 == 0)
            System.out.println((m * n) / 2);
        else
            System.out.println(((m * n) - 1) / 2);

    }
}