/*
 * Problem: Find the Town Judge
 * Platform: LeetCode
 *
 * Approach:
 * Build an adjacency list to store whom each person trusts.
 * For every person, check whether all other people trust them
 * and whether they trust nobody.
 * If both conditions are satisfied, return that person as the judge.
 * Otherwise, return -1.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(N + E)
 */

class Solution {
    public int findJudge(int n, int[][] trust) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < trust.length; i++) {

            int u = trust[i][0];
            int v = trust[i][1];

            arr.get(u).add(v);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            count = 0;

            for (int j = 1; j <= n; j++) {

                if (j == i) {
                    continue;
                }

                if (!arr.get(j).contains(i)) {
                    break;
                }

                count++;
            }

            if (count == n - 1 && arr.get(i).size() == 0) {
                return i;
            }
        }

        return -1;
    }
}