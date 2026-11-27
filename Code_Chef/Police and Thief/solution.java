/*
Problem: Police and Thief
Platform: CodeChef
Problem Link: https://www.codechef.com/problems/POLTHIEF

Approach:
For each test case, compare the positions of the police (x) and the thief (y).

If x > y, decrease x by 2 and y by 1.
If x < y, increase x by 2 and y by 1.

Repeat until both positions become equal.
Count the number of moves required and print it.

Time Complexity: O(t * m) - where m is the number of moves per test case.
Space Complexity: O(1)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            int x=sc.nextInt();

            int y=sc.nextInt();

            int count=0;

            while(x!=y){
                if(x>y){
                    x-=2;
                    y-=1;
                }   
                else{
                    x+=2;
                    y+=1;
                }
                count++;
            }

            System.out.println(count);
        }
    }
}