/*

* Problem: Same Tree
* Problem Number: 100
* Platform: LeetCode
* Problem Link: https://leetcode.com/problems/same-tree/
*
* Approach:
* Compare both trees recursively.
* If both nodes are null, they match.
* If only one node is null or their values differ, they do not match.
* Recursively compare the left and right subtrees.
*
* Time Complexity: O(n)
* Space Complexity: O(h), worst case O(n)
  */

class Solution {
public boolean isSameTree(TreeNode p, TreeNode q) {
return recursion(p, q);
}


public boolean recursion(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    }

    if (p == null || q == null) {
        return false;
    }

    return p.val == q.val
        && recursion(p.left, q.left)
        && recursion(p.right, q.right);
}


}
