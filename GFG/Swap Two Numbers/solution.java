/*
Problem: Swap Two Numbers
Platform: GeeksforGeeks (GFG)

Approach:
Use a temporary variable to store the value of a.
Assign b to a, then assign the temporary variable's value to b.
This swaps the values of the two variables.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

class GFG {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int t = a;
        a = b;
        b = t;

        System.out.println(a + " " + b);
    }
}