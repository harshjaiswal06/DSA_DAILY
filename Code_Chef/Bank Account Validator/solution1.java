
/*
 * Problem: Bank Account Validation
 * Platform: CodeChef
 * Approach: Digit Sum and Modulo
 * Time Complexity: O(N) per test case, where N is the number of digits
 * Space Complexity: O(1) auxiliary space
 *
 * Explanation:
 * Read the account number as a String to handle large numbers.
 * Calculate the sum of its digits by iterating through the String.
 * If the digit sum is divisible by 10, print "Valid";
 * otherwise, print "Invalid".
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            int sum = 0;

            for (int i = 0; i < n.length(); i++) {
                sum += n.charAt(i) - '0';
            }

            System.out.println(sum % 10 == 0 ? "Valid" : "Invalid");
        }

    }
}
