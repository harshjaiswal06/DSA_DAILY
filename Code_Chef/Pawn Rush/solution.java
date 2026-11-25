/*
 * Problem: Pawn Rush
 * Platform: CodeChef
 *
 * Approach:
 * Calculate the number of moves remaining based on the pawn's
 * position. Handle the special case when n = 2 separately.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        if (n != 2) {
            count = 8 - n;
        } else {
            count = 8 - (n - 1) - 2;
        }

        System.out.println(count);
    }
}