
/*
 * Problem: Print All Subsequences of a String
 * Platform: Self Practice
 *
 * Approach: Recursion (Pick and Not Pick)
 *
 * Explanation:
 * For each character, make two recursive calls:
 * one excluding the character and the other including it.
 * When the entire string is processed, print the
 * generated subsequence.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

public class Subsequences {

    public static void main(String args[]) {

        String s = "ABC";

        recursion(s, 0, "");

    }

    public static void recursion(String s, int i, String ans) {

        if (i == s.length()) {

            System.out.println(ans);

            return;

        }

        recursion(s, i + 1, ans);

        recursion(s, i + 1, ans += s.charAt(i));

    }

}
