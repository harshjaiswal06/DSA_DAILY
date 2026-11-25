/*
 * Problem: Print Adjacency List of Graph
 * Platform: GeeksforGeeks
 *
 * Approach:
 * Create an adjacency list with V empty lists.
 * For every edge (u, v), add v to u's list and u to v's list
 * because the graph is undirected.
 * Return the adjacency list.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    public ArrayList<ArrayList<Integer>> printGraph(int V, int edges[][]) {
        // code here

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            arr.get(u).add(v);
            arr.get(v).add(u);
        }

        return arr;
    }
}