/*
Problem: Sum of K Largest Elements
Platform: CodeChef
Link: Add the specific problem URL

Approach:

* Read the array and the value k.
* Sort the array in ascending order.
* Add the last k elements to calculate the sum.
* Print the final sum.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

class Codechef {
public static void main(String[] args) throws java.lang.Exception {

```
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {

        int n = sc.nextInt();

        int[] arr = new int[n];

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[arr.length - 1 - i];
        }

        System.out.println(sum);
    }

    sc.close();
}
```

}
