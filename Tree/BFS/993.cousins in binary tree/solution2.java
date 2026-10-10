/*
Problem: Cousins in Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/cousins-in-binary-tree/

Approach:

* Use level-order traversal (BFS).
* Track the levels and parents of both nodes.
* Nodes are cousins if they have the same level but different parents.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
public boolean isCousins(TreeNode root, int x, int y) {


    Queue<TreeNode> q = new ArrayDeque<>();

    if (root == null) return false;

    q.offer(root);

    return recursion(q, x, y, 0, 0, 0, 0, 0);
}

public boolean recursion(
        Queue<TreeNode> q,
        int x, int y,
        int levelx, int levely,
        int lw, int px, int py) {

    while (!q.isEmpty()) {

        int sizee = q.size();
        lw++;

        for (int i = 0; i < sizee; i++) {

            TreeNode f = q.poll();

            if (f.val == x) levelx = lw;
            if (f.val == y) levely = lw;

            if (f.left != null) {
                q.offer(f.left);

                if (f.left.val == x) px = f.val;
                if (f.left.val == y) py = f.val;
            }

            if (f.right != null) {
                q.offer(f.right);

                if (f.right.val == x) px = f.val;
                if (f.right.val == y) py = f.val;
            }
        }
    }

    return levelx == levely && px != py;
}


}
