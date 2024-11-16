/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_07_and_Lab_08_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
class Node{
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

public class Post_Order  {
    Node root;
    Post_Order(int data){
        this.root=new Node(data);
    }
    public void Insertion_Post_Order(Node root){
        if(root==null){
            return;
        }
        Insertion_Post_Order(root.left);
       
        Insertion_Post_Order(root.right);
        System.out.print(" "+root.val); 
    }
    public static void main(String[] args) {
        In_Order_traversal bt3=new In_Order_traversal(10);
        Node leftchild= new Node(5);
        Node rightchild= new Node(3);
        bt3.root.AddChildLeft(bt3.root, leftchild);
        bt3.root.AddChildRight(bt3.root, rightchild);
        Node leftleftchild= new Node(6);
        Node leftrightchild= new Node(8);
        bt3.root.AddChildRight(leftchild, leftrightchild);
        bt3.root.AddChildLeft(leftchild, leftleftchild);
        Node rightleftchild= new Node(9);
        Node rightrightchild= new Node(11);
        bt3.root.AddChildLeft(rightchild, rightleftchild);
        bt3.root.AddChildRight(rightchild, rightrightchild);
        System.out.println("POST - ORDER");
       
        
        
    }

    
}
