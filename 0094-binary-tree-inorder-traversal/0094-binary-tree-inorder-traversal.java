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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        inorder(root,a);
        return a;
    }
    void inorder(TreeNode node,List<Integer>a){
        if(node==null)return;
        inorder(node.left,a);
        a.add(node.val);
        inorder(node.right,a);
    }
}