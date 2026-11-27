/*
Problem: 59A. Word
Platform: Codeforces
Problem Link: https://codeforces.com/problemset/problem/59/A

Approach:
Count the uppercase letters in the given string.
The number of lowercase letters is calculated by subtracting the uppercase count from the total length.

If uppercase letters are less than or equal to lowercase letters, convert the entire string to lowercase.
Otherwise, convert the entire string to uppercase.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }
        }

        if(count<=s.length()-count){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
    }
}