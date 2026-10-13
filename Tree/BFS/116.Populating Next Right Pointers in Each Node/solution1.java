/*

* Problem: Populating Next Right Pointers in Each Node
* Approach: Level Order Traversal (BFS)
* Platform: LeetCode
* Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
* Time Complexity: O(n)
* Space Complexity: O(n)
*
* Explanation:
* Traverse the tree level by level using a queue.
* Connect each node to the next node at the same level.
* Set the last node's next pointer to null.
  */

class Solution {
public Node connect(Node root) {


    Queue<Node> q = new ArrayDeque<>();

    if (root == null) return null;

    q.offer(root);

    return recursion(q, root);
}

public Node recursion(Queue<Node> q, Node head) {

    while (!q.isEmpty()) {

        int size = q.size();
        Node prev = null;

        for (int i = 0; i < size; i++) {

            Node f = q.poll();

            if (f.left != null) q.offer(f.left);
            if (f.right != null) q.offer(f.right);

            if (prev != null) prev.next = f;

            prev = f;
        }

        prev.next = null;
    }

    return head;
}


}
