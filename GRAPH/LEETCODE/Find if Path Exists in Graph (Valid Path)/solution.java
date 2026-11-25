/*
 * Problem: Find if Path Exists in Graph (Valid Path)
 * Platform: LeetCode
 *
 * Approach:
 * Build an adjacency list to represent the undirected graph.
 * Use BFS starting from the source node and mark nodes as visited
 * when they are added to the queue.
 * If the destination is reached during BFS, increment the count.
 * Return true if the destination is reached; otherwise, return false.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int count = 0;

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            arr.get(u).add(v);
            arr.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        Queue<Integer> q = new ArrayDeque<>();

        q.offer(source);

        visited[source] = true;

        while (!q.isEmpty()) {

            int curr = q.poll();

            if (curr == destination) {
                count++;
            }

            for (int neighbour : arr.get(curr)) {

                if (!visited[neighbour]) {

                    q.offer(neighbour);

                    visited[neighbour] = true;
                }
            }
        }

        if (count > 0) return true;
        else return false;
    }
}