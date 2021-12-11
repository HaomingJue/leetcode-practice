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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null) return root.right;
            else {
                TreeNode pointer = root.left;
                while (pointer.right != null) {
                    pointer = pointer.right;
                }
                pointer.right = root.right;
                return root.left;
            }
        } 
        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);
        return root;
        
    }
}