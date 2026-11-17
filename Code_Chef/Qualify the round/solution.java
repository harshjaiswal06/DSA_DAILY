
/*
Problem: Qualify the Round
Platform: CodeChef

Approach:
1. Read the number of test cases (T).
2. For each test case, read X, A, and B.
3. Calculate the total score:
   Total Score = A + (B * 2)
4. If the total score is greater than or equal to X,
   print "Qualify".
5. Otherwise, print "NotQualify".

Time Complexity: O(T)
Space Complexity: O(1)
*/

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = a + (b * 2);

            if (ans >= x) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
    }
}
