/*
 * Problem: Binary Tree Preorder Traversal
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/binary-tree-preorder-traversal/
 *
 * Approach: Recursion
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> arr = new ArrayList<>();

        return preorder(root, arr);
    }

    public static List<Integer> preorder(TreeNode root, List<Integer> arr) {

        if (root == null) return arr;

        arr.add(root.val);

        preorder(root.left, arr);

        preorder(root.right, arr);

        return arr;
    }
}