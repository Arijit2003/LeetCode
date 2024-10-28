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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=1;i<=count;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    if(temp.left.left==null && temp.left.right==null)sum+=temp.left.val;
                }
                if(temp.right!=null)q.add(temp.right);
            }
        }
        return sum;
    }
}