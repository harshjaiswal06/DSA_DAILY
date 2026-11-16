import java.util.*;
import java.lang.*;
import java.io.*;

/*
Problem: Largest Even Number from String
Platform: CodeChef

Approach:
- Extract all numeric digits from the input string and store them in an ArrayList.
- Calculate the sum of all digits and find the smallest even digit.
- If no digits are present, print -1.
- If the sum is zero, print 0.
- If no even digit exists, print -1.
- Remove one occurrence of the smallest even digit.
- Sort the remaining digits in ascending order.
- Place the smallest even digit at the beginning and construct the largest possible even number by traversing the list in reverse.

Time Complexity: O(N log N)
Space Complexity: O(N)
*/

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                ar.add(s.charAt(i) - '0');
            }
        }

        int rs = Integer.MAX_VALUE;
        int sum = 0;

        int count = ar.size();

        for(int i = 0; i < count; i++)
        {
            int d = ar.get(i);

            sum += d;

            if(d % 2 == 0 && d < rs)
            {
                rs = d;
            }
        }

        if(ar.size() == 0)
        {
            System.out.println(-1);
        }
        else if(sum == 0)
        {
            System.out.println(0);
        }
        else if(rs == Integer.MAX_VALUE)
        {
            System.out.println(-1);
        }
        else
        {
            for(int i = 0; i < count; i++)
            {
                if(ar.get(i) == rs)
                {
                    ar.remove(i);
                    break;
                }
            }

            Collections.sort(ar);

            ar.add(0, rs);

            StringBuilder sb = new StringBuilder();

            for(int i = ar.size() - 1; i >= 0; i--)
            {
                sb.append(ar.get(i));
            }

            System.out.println(sb);
        }
    }
}