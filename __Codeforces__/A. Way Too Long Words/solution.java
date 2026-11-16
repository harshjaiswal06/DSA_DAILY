import java.util.*;

/*
Problem: A. Way Too Long Words
Platform: Codeforces

Approach:
- Read the number of test cases.
- For each word, check its length.
- If the length is greater than 10:
  - Print the first character.
  - Print the number of characters between the first and last characters.
  - Print the last character.
- Otherwise, print the original word.

Time Complexity: O(N) per test case
Space Complexity: O(N)
*/

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next();

            if(s.length() > 10)
            {
                System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            }
            else
            {
                System.out.println(s);
            }
        }
    }
}