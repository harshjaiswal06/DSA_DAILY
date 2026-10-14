/*

* Problem: Invert Binary Tree
* Problem Number: 226
* Platform: LeetCode
* Problem Link: https://leetcode.com/problems/invert-binary-tree/
*
* Approach:
* Recursively invert the binary tree by swapping the left
* and right children of every node.
*
* Time Complexity: O(n)
* Space Complexity: O(h), worst case O(n)
  */

class Solution {
public TreeNode invertTree(TreeNode root) {
return recursion(root);
}

public TreeNode recursion(TreeNode root) {
    if (root == null) {
        return null;
    }

    TreeNode f = root.left;

    root.left = root.right;
    root.right = f;

    recursion(root.left);
    recursion(root.right);

    return root;
}

}
