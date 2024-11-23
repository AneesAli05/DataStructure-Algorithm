/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_09_Anees_Ahmed;
class Node{
 int data;
 Node left;
 Node right;
 Node(int data){
 this.data=data;
 this.left=this.right=null;
 }
         
    
}
public class DeletingNode{
    Node root;
    DeletingNode(){
        this.root=null;
    }
    void Insertion(int val){
        if(root==null){
        this.root=new Node(val);
            System.out.println("Inserted at root ");    
             return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            
            if (val < current.data) {
                current = current.left;
                if (parent.left == null) {
                    parent.left = new Node(val);
                    System.out.println(val + " inserted at left");
                    return;
                }
               
            } else {
                current = current.right;
                if (parent.right == null) {
                    parent.right = new Node(val);
                    System.out.println(val+ " inserted at right");
                    return;
                }

        
    }
        }
    }
    void In_Order(Node root){
        if(root==null){
            return;
        }
        In_Order(root.left);
        System.out.print(" "+root.data);
        In_Order(root.right);
        
    }
    Node deletion(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deletion(root.left, key);
        } else if (key > root.data) {
            root.right = deletion(root.right, key); 
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node temp = root.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            root.data= temp.data;
            root.right = deletion(root.right, temp.data);
        }

        return root;
    }
    public static void main(String[] args) {
        DeletingNode n1=new DeletingNode();
        System.out.println("");
        n1.Insertion(8);
        n1.Insertion(45);
         n1.Insertion(4);
        n1.Insertion(89);
         n1.Insertion(14);
        n1.Insertion(3);
         n1.Insertion(70);
        n1.Insertion(6);
        n1.In_Order(n1.root);
        System.out.println(" ");
        n1.deletion(n1.root,70);
        n1.In_Order(n1.root);
        System.out.println("");

       
    }
    

}
