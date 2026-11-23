/*
Problem: 281A - Word Capitalization
Platform: Codeforces
Approach: Character Manipulation
Time Complexity: O(n)
Space Complexity: O(n)

Explanation:
Check the first character of the string.
If it is lowercase, convert it to uppercase.
Keep the remaining characters unchanged and print the result.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String ans = "";

        if (s.charAt(0) > 90) {
            ans += (char) (s.charAt(0) - 32);
            ans += s.substring(1);
        } else {
            ans = s;
        }

        System.out.println(ans);
    }
}