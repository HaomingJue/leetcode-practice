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
        List<Integer> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        queue.add(root); 
        while (!queue.isEmpty()) {
            int size = queue.size() - 1;
            TreeNode node = queue.poll();
            ret.add(node.val);
            if (node.right != null) queue.add(node.right);
            if (node.left != null) queue.add(node.left);
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }
        return ret;
    }
}