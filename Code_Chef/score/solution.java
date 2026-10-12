/*
Problem: Find the Maximum of Three Numbers
Platform: CodeChef
Link: Add the specific problem URL

Approach:

* Read three integers into an array.
* Sort the array in ascending order.
* Print the last element, which is the maximum.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

class Codechef {
public static void main(String[] args) throws java.lang.Exception {


    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    while (n-- > 0) {

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);
    }

    sc.close();
}


}
