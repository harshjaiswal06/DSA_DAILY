/*
Problem: 791A - Bear and Big Brother
Platform: Codeforces
Approach: Simulation
Time Complexity: O(log b)
Space Complexity: O(1)

Explanation:
Multiply Limak's weight by 3 and Bob's weight by 2
in each iteration. Count the number of years until
Limak's weight becomes greater than Bob's weight.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int b = sc.nextInt();

        int count = 0;

        while (n <= b) {
            n = n * 3;
            b = b * 2;
            count++;
        }

        System.out.println(count);
    }
}