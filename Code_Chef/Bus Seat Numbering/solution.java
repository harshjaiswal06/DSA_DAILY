/*
Problem: Bus Seat Numbering
Platform: CodeChef
Approach: Conditional Statements
Time Complexity: O(n)
Space Complexity: O(1)

Explanation:
Check the seat number against the given ranges and print
the corresponding seat type: Lower Double, Lower Single,
Upper Double, or Upper Single.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int t = sc.nextInt();

            if (t > 0 && t <= 10)
                System.out.println("Lower Double");

            else if (t > 10 && t <= 15)
                System.out.println("Lower Single");

            else if (t > 15 && t <= 25)
                System.out.println("Upper Double");

            else
                System.out.println("Upper Single");
        }
    }
}