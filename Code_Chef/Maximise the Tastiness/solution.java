/*
Problem: Maximise the Tastiness
Platform: CodeChef

Approach:
- Read the four values into an array.
- Calculate all four possible combinations of the given values.
- Find the maximum among the combinations using Math.max().
- Print the maximum tastiness for each test case.

Time Complexity: O(1) per test case
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

		int n=sc.nextInt();

		while(n-->0){

		    int [] arr=new int [4];

		    for(int i=0;i<4;i++){
		        arr[i]=sc.nextInt();
		    }

		    int a=arr[0]+arr[2];
		    int b=arr[1]+arr[2];
		    int c=arr[0]+arr[3];
		    int d=arr[1]+arr[3];

		    int u=Math.max(a,b);
		    int y=Math.max(c,d);

		    System.out.println(Math.max(u,y));
		}

	}
}