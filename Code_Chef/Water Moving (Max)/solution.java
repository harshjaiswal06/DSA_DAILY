/*

* Problem: Sum of the Largest J Elements
* Platform: CodeChef
* Problem Link: Add the original CodeChef problem URL
*
* Approach:
* Sort the array in ascending order, then traverse from the end
* and add the largest J elements (or all elements if J > N).
*
* Time Complexity: O(N log N) per test case
* Space Complexity: O(N) for the input array
  */

import java.util.*;

class Codechef {
public static void main(String[] args) throws java.lang.Exception {
Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {
        int n = sc.nextInt();
        int j = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;

        for (int p = arr.length - 1;
             p >= Math.max(arr.length - 1 - j, 0); p--) {
            sum += arr[p];
        }

        System.out.println(sum);
    }

    sc.close();
}


}
