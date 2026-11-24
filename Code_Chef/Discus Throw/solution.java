/*
Problem: Discus Throw
Platform: CodeChef
Approach: Iteration
Time Complexity: O(n)
Space Complexity: O(1)

Explanation:
Initialize sum to 0 and repeatedly add n to sum while
decrementing n until it becomes 0. Print the final sum.
*/

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        // code here
        while (n > 0) {
            sum += n;
            n--;
        }

        System.out.println(sum);
    }
}