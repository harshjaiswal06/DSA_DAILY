/*

* Problem: Compare 3N with N + N2
* Platform: CodeChef
* Approach: Conditional Comparison
* Time Complexity: O(1)
* Space Complexity: O(1)
*
* Explanation:
* Read two integers and compare 3 * n with n + n2.
* Print the smaller value.
  */

import java.util.*;

class Codechef {
public static void main(String[] args) throws java.lang.Exception {

  Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int n2 = sc.nextInt();

    if (3 * n < n + n2) {
        System.out.println(3 * n);
    } else {
        System.out.println(n + n2);
    }

    sc.close();
}

}
