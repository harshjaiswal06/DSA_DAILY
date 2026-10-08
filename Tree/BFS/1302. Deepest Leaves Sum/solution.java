/*
Problem: Deepest Leaves Sum
Platform: LeetCode
Link: https://leetcode.com/problems/deepest-leaves-sum/

Approach:
- Use level-order traversal (BFS).
- Store the values of each level.
- After BFS finishes, sum the values of the last level.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) return 0;

        q.offer(root);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        return recursion(q, arr);
    }

    public int recursion(Queue<TreeNode> q, ArrayList<ArrayList<Integer>> arr) {

        while (!q.isEmpty()) {

            int size = q.size();
            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode f = q.poll();

                if (f.left != null) q.offer(f.left);
                if (f.right != null) q.offer(f.right);

                a.add(f.val);
            }

            arr.add(a);
        }

        ArrayList<Integer> a = arr.get(arr.size() - 1);

        int sum = 0;

        for (int x : a) {
            sum += x;
        }

        return sum;
    }
}