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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length <= 0) return null;
        
        int n = nums.length;
        return dfs(nums,0,n-1);
    }
    
    static TreeNode dfs(int[] nums, int s, int e){
        if(s > e){
            return null;
        }
        
        int mid = (s + e)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums,s,mid-1);
        root.right = dfs(nums,mid+1,e);
        
        return root;
        
    }
}