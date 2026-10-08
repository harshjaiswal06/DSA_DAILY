/*
Problem: Maximum Level Sum of a Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/

Approach:
- Traverse the tree level by level using BFS.
- Calculate the sum of every level.
- Keep track of the level having the maximum sum.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) return 0;

        q.offer(root);

        return recursion(q, Integer.MIN_VALUE, 0, 0);
    }

    public int recursion(
            Queue<TreeNode> q,
            int maxSum,
            int level,
            int maxLevel) {

        while (!q.isEmpty()) {

            int size = q.size();
            int sum = 0;

            level++;

            for (int i = 0; i < size; i++) {

                TreeNode t = q.poll();

                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);

                sum += t.val;
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
        }

        return maxLevel;
    }
}