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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null)return res;
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=1;i<=count;i++){
                TreeNode temp=q.poll();
                if(i==count)res.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
        }
        return res;
    }
}