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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return root;
        }
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                TreeNode tempValue = null;
                tempValue = curr.left;
                curr.left = curr.right;
                curr.right = tempValue;               
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                } 
            }
        }
        return root;
    }
}
