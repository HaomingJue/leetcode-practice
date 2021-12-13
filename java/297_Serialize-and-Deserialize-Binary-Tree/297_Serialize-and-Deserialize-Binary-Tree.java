/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    //1 2 null null 3 4 null null 5 null null
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }
    
    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null ");
            return;
        }
        sb.append(root.val + " ");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    
    int index = 0;
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(" ");
        return buildTree(strs);
    }
    
    private TreeNode buildTree(String[] strs) {
        if (index >= strs.length || strs[index].equals("null")) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(strs[index++]));
        root.left = buildTree(strs);
        root.right = buildTree(strs);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));