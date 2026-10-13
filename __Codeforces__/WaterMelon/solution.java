/*

* Problem: Watermelon
* Platform: Codeforces
* Problem Link: https://codeforces.com/problemset/problem/4/A
* Approach: Mathematical / Parity Check
* Time Complexity: O(1)
* Space Complexity: O(1)
*
* Explanation:
* The watermelon can be divided into two parts with positive,
* even weights only if its total weight is even and greater than 2.
  */


import java.util.*;

public class watermelon {

public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n > 2 && n % 2 == 0) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }

    sc.close();
}


}
