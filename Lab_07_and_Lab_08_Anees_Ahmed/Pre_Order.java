/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_07_and_Lab_08_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
        this.left=null;
         this.right=null;
    }
    public void AddChildLeft(Node parent, Node child){
        parent.left=child;
    }
    public void AddChildRight(Node parent, Node child){
        parent.right=child;
    }
}
public class Pre_Order  {
    Node root;
    Pre_Order(int data){
        this.root=new Node(data);
    }
    public void Insertion_Pre_Order(Node root){
        if(root==null){
            return;
        }
                System.out.print(" "+root.val);
        Insertion_Pre_Order(root.left);
       
        Insertion_Pre_Order(root.right);
        
    }
    public static void main(String[] args) {
        In_Order_traversal bt=new In_Order_traversal(10);
        Node leftchild= new Node(5);
        Node rightchild= new Node(3);
        bt.root.AddChildLeft(bt.root, leftchild);
        bt.root.AddChildRight(bt.root, rightchild);
        Node leftleftchild= new Node(6);
        Node leftrightchild= new Node(8);
        bt.root.AddChildRight(leftchild, leftrightchild);
        bt.root.AddChildLeft(leftchild, leftleftchild);
        Node rightleftchild= new Node(9);
        Node rightrightchild= new Node(11);
        bt.root.AddChildLeft(rightchild, rightleftchild);
        bt.root.AddChildRight(rightchild, rightrightchild);
        bt.Insertion_InOrder(bt.root);
        
        
    }

    
}
