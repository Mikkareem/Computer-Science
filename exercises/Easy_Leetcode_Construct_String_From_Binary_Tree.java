/**
https://leetcode.com/problems/construct-string-from-binary-tree/description/
*/


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
    private void temp(TreeNode root, StringBuilder str) {
        if(root == null) return;

        str.append(root.val);
        if(root.left != null) {
            str.append("(");
            temp(root.left, str);
            str.append(")");
        }

        if(root.left == null && root.right != null) {
            str.append("()");
        }

        if(root.right != null) {
            str.append("(");
            temp(root.right, str);
            str.append(")");
        }
    }

    public String tree2str(TreeNode root) {
        StringBuilder s = new StringBuilder();
        temp(root, s);
        return s.toString();
    }
}
