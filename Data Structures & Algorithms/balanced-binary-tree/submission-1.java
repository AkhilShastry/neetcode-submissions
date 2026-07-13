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
    public boolean isBalanced(TreeNode root) {
        boolean [] res = new boolean[1];
        res[0] = true;
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, boolean [] arr){
        if(root == null){
            return 0;
        }

        int left = dfs(root.left, arr);
        int right = dfs(root.right, arr);
        if(Math.abs(left - right) > 1){
            arr[0] = arr[0] && false;
        }
        return 1 + Math.max(left, right);
    }
}
