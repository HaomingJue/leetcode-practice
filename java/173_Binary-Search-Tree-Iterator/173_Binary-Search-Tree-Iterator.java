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
class BSTIterator {

    Queue<Integer> queue = new LinkedList<>();
    
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        queue.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return queue.poll();
    }
    
    public boolean hasNext() {
        if (queue.isEmpty()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */