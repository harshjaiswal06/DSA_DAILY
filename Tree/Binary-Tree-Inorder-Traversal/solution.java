/*
 * Problem: Binary Tree Inorder Traversal
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
 *
 * Approach: Recursion
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> arr = new ArrayList<>();

        return order(root, arr);
    }

    public List<Integer> order(TreeNode root, List<Integer> arr) {

        if (root == null) return arr;

        order(root.left, arr);

        arr.add(root.val);

        order(root.right, arr);

        return arr;
    }
}