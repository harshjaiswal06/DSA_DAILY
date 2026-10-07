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
    public int maxDepth(TreeNode root) {

        return depth(root);
        
    }

    public static int depth(TreeNode root){

        if(root==null) return 0;

        int l=depth(root.left);

        int r=depth(root.right);

        return 1+Math.max(l,r);
        //+1 for the root node like 
        /*

                   4

            null         null 


            so then so thats why max(0,0) and then +1 for the 4
            */

    }
}