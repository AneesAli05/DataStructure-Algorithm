/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Task_04 {
    class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode current =root.right;
        root.right=root.left;
        root.left=current;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }
}
}
