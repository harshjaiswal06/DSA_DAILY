/*

* Problem: Average of Levels in Binary Tree
* Approach: Level Order Traversal (BFS)
* Platform: LeetCode
* Link: https://leetcode.com/problems/average-of-levels-in-binary-tree/
* Time Complexity: O(n)
* Space Complexity: O(w), excluding the returned result,
* where w is the maximum width of the tree.
*
* Explanation:
* Traverse the tree level by level using a queue.
* Calculate the sum of node values at each level.
* Divide the sum by the number of nodes at that level
* and store the average in the result list.
  */

class Solution {
public List<Double> averageOfLevels(TreeNode root) {


    Queue<TreeNode> q = new ArrayDeque<>();
    List<Double> arr = new ArrayList<>();

    if (root == null) return arr;

    q.offer(root);

    return recursion(q, arr);
}

public List<Double> recursion(
        Queue<TreeNode> q, List<Double> arr) {

    while (!q.isEmpty()) {

        int size = q.size();
        double sum = 0;

        for (int i = 0; i < size; i++) {

            TreeNode f = q.poll();

            if (f.left != null) q.offer(f.left);
            if (f.right != null) q.offer(f.right);

            sum += f.val;
        }

        arr.add(sum / size);
    }

    return arr;
}

}
