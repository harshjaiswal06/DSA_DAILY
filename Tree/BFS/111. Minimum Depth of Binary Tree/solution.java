/*
Problem: Minimum Depth of Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/

Approach:
- Use level-order traversal (BFS).
- The first leaf node encountered gives the minimum depth.
- Return the current level as soon as a leaf is found.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int minDepth(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) return 0;

        q.offer(root);

        return recursion(q, 0);
    }

    public int recursion(Queue<TreeNode> q, int level) {

        while (!q.isEmpty()) {

            int size = q.size();

            level++;

            for (int i = 0; i < size; i++) {

                TreeNode f = q.poll();

                if (f.left == null && f.right == null) {
                    return level;
                }

                if (f.left != null) q.offer(f.left);
                if (f.right != null) q.offer(f.right);
            }
        }

        return level;
    }
}