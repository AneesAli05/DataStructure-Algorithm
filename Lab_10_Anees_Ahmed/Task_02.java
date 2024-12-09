/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_10_Anees_Ahmed;

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
          
      }
  }
public class Task_02 {
        public int maxDepth(TreeNode root) {
         if(root==null){
             return 0;
         }   
         int left=maxDepth(root.left);
         int right=maxDepth(root.right);
         int result=1+Math.max(left, right);
         return result;
    }

    public static void main(String[] args) {
        
    }
}
