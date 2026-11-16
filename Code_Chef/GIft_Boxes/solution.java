import java.util.*;
import java.lang.*;
import java.io.*;

/*
Problem: Gift Boxes
Platform: CodeChef

Approach:
- Handle the special case when both x and y are zero.
- If y is zero but x is non-zero, print NO.
- Otherwise, check whether the integer division y/x is at least 3.
- Print YES if the condition is satisfied; otherwise, print NO.

Time Complexity: O(T)
Space Complexity: O(1)
*/

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y == 0 && x == 0)
                System.out.println("YES");

            else if(y == 0 && x != 0)
                System.out.println("NO");

            else if(y / x >= 3)
                System.out.println("YES");

            else
                System.out.println("NO");
        }
    }
}