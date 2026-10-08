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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> arr=new ArrayList<>();


        Queue<TreeNode> que=new ArrayDeque <>();

        if(root==null){
            return arr;
        }

        que.offer(root);

        // why root not root.val because we need to find its children 

       return level(root,arr,que);
        
    }

    public List<List<Integer>> level(TreeNode root, List<List<Integer>> arr,Queue<TreeNode> que){



        while(!que.isEmpty()){

            List<Integer> ans=new ArrayList<>();


            int siz=que.size();

            while(siz>0){

                TreeNode f= que.poll();

                ans.add(f.val);

                if(f.left != null){

                    que.offer(f.left);

                }
                 if(f.right != null){

                    que.offer(f.right);

                }

                siz--;

            }

            arr.add(ans);

        }

        return arr;
    }
}