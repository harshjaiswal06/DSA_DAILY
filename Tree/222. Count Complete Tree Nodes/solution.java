/*
 * Problem: Count Complete Tree Nodes
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/count-complete-tree-nodes/
 *
 * Approach: Recursion
 *Time: Θ(log² n)
  Space: O(log n)
 */
class Solution {
    public int countNodes(TreeNode root) {

        return counting(root);
        
    }

    public int counting (TreeNode root){

        if(root==null) return 0;

        int left=lheight(root,0);

        int right=rheight(root,0);

        if(left==right) return (int)Math.pow(2,left)-1;

        return 1+counting(root.left)+counting(root.right);
    }

    public int lheight(TreeNode root,int count){

        if(root==null) return count;

        count+=1;

        return lheight(root.left,count);
    }

    public int rheight(TreeNode root,int count){
        
        if(root==null) return count;

        count+=1;

        return rheight(root.right,count);
    }
}

/*in my thinking the main thing of this question is just remeber that the formula for finding total number of nodes in a perfect tree we have to apply it everywhere */

