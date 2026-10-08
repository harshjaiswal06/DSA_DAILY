/*
Problem: Binary Tree Right Side View
Platform: LeetCode
Link: https://leetcode.com/problems/binary-tree-right-side-view/

Approach:
- Use level-order traversal (BFS).
- Store all nodes of the current level.
- The last node of each level is visible from the right side.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) return ans;

        q.offer(root);

        return rightView(q, ans);
    }

    public List<Integer> rightView(
            Queue<TreeNode> q,
            List<Integer> ans) {

        while (!q.isEmpty()) {

            int size = q.size();

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode r = q.poll();

                if (r.left != null) q.offer(r.left);
                if (r.right != null) q.offer(r.right);

                arr.add(r.val);
            }

            ans.add(arr.get(arr.size() - 1));
        }

        return ans;
    }
}