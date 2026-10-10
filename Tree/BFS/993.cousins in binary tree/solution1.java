/*
Problem: Cousins in Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/cousins-in-binary-tree/

Approach:

* Use level-order traversal (BFS).
* Track the parent of x and y.
* Check whether both nodes are at the same level
  and have different parents.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
public boolean isCousins(TreeNode root, int x, int y) {


    if (root == null) return false;

    Queue<TreeNode> q = new ArrayDeque<>();
    q.offer(root);

    return recursion(q, x, y);
}

public boolean recursion(Queue<TreeNode> q, int x, int y) {

    while (!q.isEmpty()) {

        int size = q.size();
        boolean foundX = false;
        boolean foundY = false;

        for (int i = 0; i < size; i++) {

            TreeNode f = q.poll();

            if (f.left != null && f.right != null) {

                if ((f.left.val == x && f.right.val == y) ||
                    (f.left.val == y && f.right.val == x)) {
                    return false;
                }
            }

            if (f.left != null) {
                q.offer(f.left);
            }

            if (f.right != null) {
                q.offer(f.right);
            }

            if (f.val == x) foundX = true;
            if (f.val == y) foundY = true;
        }

        if (foundX && foundY) return true;

        if (foundX || foundY) return false;
    }

    return false;
}


}
