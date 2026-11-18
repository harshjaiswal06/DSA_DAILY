
import java.util.*;

/*
 * Problem: Next Round
 * Platform: Codeforces
 *
 * Approach: Array Traversal
 *
 * Explanation:
 * Take the score of the participant at position p as the
 * minimum qualifying score. Traverse the array and count
 * participants whose scores are at least this score
 * and greater than 0.
 *
 * Time Complexity: O(k)
 * Space Complexity: O(k)
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int p = sc.nextInt();

        if (k < p) {
            System.out.println();
        } else {
            int[] arr = new int[k];

            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }

            int h = arr[p - 1];
            int xount = 0;

            for (int x : arr) {
                if (h <= x && x > 0) {
                    xount++;
                }
            }

            System.out.println(xount);
        }
    }
}
