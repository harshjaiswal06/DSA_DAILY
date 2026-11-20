/*
Problem: Beautiful Matrix
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/263/A

Approach:
Find the position of 1 in the 5 × 5 matrix.
Store its row and column indices.
Calculate the number of moves required to bring 1 to the center
position (2, 2) by moving vertically and horizontally.
The total number of moves is the sum of the row and column moves.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int rows = 0;
        int count = 0;
        int col = 0;

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 1) {
                    rows = i;
                    col = j;
                }
            }
        }

        int i = rows;
        int j = col;

        if (i != 2) {
            if (i < 2) {
                while (i != 2) {
                    i++;
                    count++;
                }
            }
            else if (i > 2) {
                while (i != 2) {
                    i--;
                    count++;
                }
            }
        }

        if (j != 2) {
            if (j < 2) {
                while (j != 2) {
                    j++;
                    count++;
                }
            }
            else if (j > 2) {
                while (j != 2) {
                    j--;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}