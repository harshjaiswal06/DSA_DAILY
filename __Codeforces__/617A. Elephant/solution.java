/*
Problem: 617A. Elephant
Platform: Codeforces

Approach:
- Greedily take the largest possible step from 5, 4, 3, 2, or 1.
- Subtract the step from the remaining distance.
- Increment count for every step until the distance becomes 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int count=0;

        while(n!=0){

            if(n-5>=0){
                n=n-5;
                count++;
            }
            else if(n-4>=0){
                n=n-4;
                count++;
            }
            else if(n-3>=0){
                n=n-3;
                count++;
            }
            else if(n-2>=0){
                n=n-2;
                count++;
            }
            else{
                n=n-1;
                count++;
            }
        }

        System.out.println(count);
    }
}