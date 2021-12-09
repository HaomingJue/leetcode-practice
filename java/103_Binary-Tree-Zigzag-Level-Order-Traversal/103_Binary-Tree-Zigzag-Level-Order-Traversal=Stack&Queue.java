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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 1;
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while(!queue.isEmpty()) {
                stack.push(queue.poll());
            }
            while(!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                list.add(cur.val);
                if (flag == 1) {
                    if (cur.left != null) queue.add(cur.left);
                    if (cur.right != null) queue.add(cur.right);
                }
                if (flag == -1) {
                    if (cur.right != null) queue.add(cur.right);
                    if (cur.left != null) queue.add(cur.left);
                }
            }
            ret.add(list);
            flag *= -1;
        }
        return ret;
    }
}