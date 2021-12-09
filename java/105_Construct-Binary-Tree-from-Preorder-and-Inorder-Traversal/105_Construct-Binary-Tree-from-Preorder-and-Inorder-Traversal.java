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
    
    private int rootID;
    private HashMap<Integer, Integer> map;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return buildTree(preorder, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;
        TreeNode root = new TreeNode(preorder[rootID++]);
        root.left = buildTree(preorder, inorder, start, map.get(root.val) - 1);
        root.right = buildTree(preorder, inorder, map.get(root.val) + 1, end);
        return root;
    }
}