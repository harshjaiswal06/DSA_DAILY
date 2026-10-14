/*

* Problem: Maximum Depth of Binary Tree
* Problem Number: 104
* Platform: LeetCode
* Problem Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
*
* Approach:
* Recursively calculate the maximum depth of the left and right subtrees.
* Return 0 when the current node is null.
* Otherwise, return 1 + the maximum of both subtree depths.
*
* Time Complexity: O(n)
* Space Complexity: O(h), worst case O(n)
  */

class Solution {
public int maxDepth(TreeNode root) {
return recursion(root);
}


public int recursion(TreeNode root) {
    if (root == null) {
        return 0;
    }

    return 1 + Math.max(
        recursion(root.left),
        recursion(root.right)
    );
}


}
