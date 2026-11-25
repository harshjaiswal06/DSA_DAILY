/*
 * Problem: Find Center of Star Graph
 * Platform: LeetCode
 *
 * Approach:
 * Build an adjacency list to represent the graph.
 * In a star graph with N vertices, the center vertex has degree N - 1.
 * Since the number of edges is N - 1, the center vertex will have
 * an adjacency list size equal to edges.length.
 * Return the vertex whose degree matches this condition.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

class Solution {
    public int findCenter(int[][] edges) {

        // In a star graph, the center has N - 1 connected edges.

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= edges.length + 1; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            arr.get(u).add(v);
            arr.get(v).add(u);
        }

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).size() == edges.length) {
                return i;
            }
        }

        return -1;
    }
}