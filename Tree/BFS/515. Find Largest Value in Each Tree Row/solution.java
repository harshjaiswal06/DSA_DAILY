/*
Problem: Find Largest Value in Each Tree Row
Platform: LeetCode
Link: https://leetcode.com/problems/find-largest-value-in-each-tree-row/

Approach:
- Use level-order traversal (BFS).
- Store all values of the current level.
- Sort the level and take the largest value.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> arr = new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) return arr;

        q.offer(root);

        return recursion(q, arr);
    }

    public List<Integer> recursion(
            Queue<TreeNode> q,
            List<Integer> arr) {

        while (!q.isEmpty()) {

            int size = q.size();

            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode f = q.poll();

                if (f.left != null) q.offer(f.left);
                if (f.right != null) q.offer(f.right);

                a.add(f.val);
            }

            Collections.sort(a);

            arr.add(a.get(a.size() - 1));
        }

        return arr;
    }
}