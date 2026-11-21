/*
Problem: Petya and Strings
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/112/A

Approach:
Convert both strings to lowercase to make the comparison case-insensitive.
Traverse both strings character by character.
If the characters differ, compare their alphabetical order and print 1 or -1.
If all characters are equal, print 0.

Time Complexity: O(n)
Space Complexity: O(1) auxiliary space
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        int count = 0;

        s = s.toLowerCase();
        p = p.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != p.charAt(i)
                    && (s.charAt(i) - ' ') != p.charAt(i)
                    && (p.charAt(i) - ' ') != s.charAt(i)) {

                if (s.charAt(i) > p.charAt(i)) {
                    System.out.println(1);
                    break;
                }
                else {
                    System.out.println(-1);
                    break;
                }

            }
            else {
                count++;
            }

        }

        if (count == s.length()) {
            System.out.println(0);
        }
    }
}