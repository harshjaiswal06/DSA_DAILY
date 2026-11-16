import java.util.*;
import java.lang.*;
import java.io.*;

/*
Problem: Word Guess
Platform: CodeChef

Approach:
- Read the two strings S and R.
- Compare characters at each corresponding index.
- If both characters match, append 'G' to the result.
- Otherwise, append 'B'.
- Print the resulting string for each test case.

Time Complexity: O(N) per test case
Space Complexity: O(N)
*/

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next();
            String r = sc.next();

            String m = "";

            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == r.charAt(i))
                {
                    m += "G";
                }
                else
                {
                    m += "B";
                }
            }

            System.out.println(m);
        }
    }
}