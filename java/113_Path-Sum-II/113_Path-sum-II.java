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
    List<List<Integer>> ret;
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ret = new ArrayList<>();
        pathSum(root, targetSum, new ArrayList<>());
        return ret;
    }
    
    public void pathSum(TreeNode node, int targetSum, List<Integer> list) {
        if (node == null) return;
        List<Integer> tempList = new ArrayList<>(list);
        targetSum -= node.val;
        tempList.add(node.val);
        if(node.left == null && node.right == null) {
            if (targetSum == 0) {
                ret.add(tempList);
                return;
            } else {
                return;
            }
        }
        pathSum(node.left, targetSum, tempList);
        pathSum(node.right, targetSum, tempList);
    }
}