/*
Problem: Watching Movies at 2x
Platform: CodeChef
Problem Link: https://www.codechef.com/problems/ watchingmovies

Approach:
Read the total duration of the movie (n) and the duration watched at 2x speed (y).
Since watching at 2x speed takes half the original time, calculate y/2.
Subtract y from the original duration and add y/2 to get the total time taken.

Time Complexity: O(1)
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

        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();

        int y=sc.nextInt();

        int skip=y/2;// beacuse at twice speed he was watching the movie

        n=n-y;

        System.out.println(n+skip);
    }
}