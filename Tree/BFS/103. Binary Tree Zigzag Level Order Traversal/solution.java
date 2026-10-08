/*
Problem: Binary Tree Zigzag Level Order Traversal
Platform: LeetCode
Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

Approach:
- Use level-order traversal (BFS).
- Store every level in a list.
- Reverse alternate levels to create the zigzag order.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();

        List<List<Integer>> arr = new ArrayList<>();

        if (root == null) return arr;

        q.offer(root);

        return recursion(q, arr, 0);
    }

    public List<List<Integer>> recursion(
            Queue<TreeNode> q,
            List<List<Integer>> arr,
            int level) {

        while (!q.isEmpty()) {

            int size = q.size();

            level++;

            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();

                if (temp.left != null) q.offer(temp.left);
                if (temp.right != null) q.offer(temp.right);

                a.add(temp.val);
            }

            if (level % 2 == 0) {
                Collections.reverse(a);
            }

            arr.add(a);
        }

        return arr;
    }
}