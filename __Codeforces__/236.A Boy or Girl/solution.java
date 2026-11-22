/*
Problem: Boy or Girl
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/236/A

Approach:
Use a HashMap to store the distinct characters present in the string.
If a character is encountered for the first time, insert it into the map.
Otherwise, increment its frequency.
Check the number of distinct characters using the map's size.
If the number is even, print "CHAT WITH HER!".
Otherwise, print "IGNORE HIM!".

Time Complexity: O(n)
Space Complexity: O(k), where k is the number of distinct characters.
*/

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashMap<Character, Integer> arr = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!arr.containsKey(s.charAt(i))) {
                arr.put(s.charAt(i), 0);
            }
            else {
                arr.put(s.charAt(i), arr.get(s.charAt(i)) + 1);
            }
        }

        if (arr.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}