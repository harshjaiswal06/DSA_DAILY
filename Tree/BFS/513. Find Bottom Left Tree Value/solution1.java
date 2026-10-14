/*

* Problem: Find Bottom Left Tree Value
* Problem Number: 513
* Platform: LeetCode
* Problem Link: https://leetcode.com/problems/find-bottom-left-tree-value/
*
* Approach:
* Perform level-order traversal using a queue.
* Store the first node's value at each level.
* The final stored value is the bottom-left value.
*
* Time Complexity: O(n)
* Space Complexity: O(n)
  */

import java.util.*;

class Solution {
public int findBottomLeftValue(TreeNode root) {
Queue<TreeNode> q = new ArrayDeque<>();
q.offer(root);

    int ans = root.val;

    while (!q.isEmpty()) {
        int size = q.size();

        ans = q.peek().val;

        for (int i = 0; i < size; i++) {
            TreeNode node = q.poll();

            if (node.left != null) {
                q.offer(node.left);
            }

            if (node.right != null) {
                q.offer(node.right);
            }
        }
    }

    return ans;
}


}
