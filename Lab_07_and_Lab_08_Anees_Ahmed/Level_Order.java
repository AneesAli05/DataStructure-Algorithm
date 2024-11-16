/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_07_and_Lab_08_Anees_Ahmed;
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

void AddLeftChild(Node parent, Node child){
parent.left=child;
}
void AddRightChild(Node parent, Node child){
    parent.right=child;
}
}
public class Level_Order{
 Node root;
 Level_Order(int data){
  this.root=new Node(data);
 }
 public void Level_Order_traversal(Node root){   
    Queue <Node> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        Node cur=queue.remove();
        System.out.print(" "+cur.data);
        if(cur.left!=null){
            queue.add(cur.left);
    }
        if(cur.right!=null){
            queue.add(cur.right);
        }
    }
     
     
 }
    public static void main(String[] args) {
        Level_Order n1= new Level_Order(1);
        System.out.println(" "+n1.root.data);
        Node n2=new  Node(2);
        Node n3=new Node(3);
        
        n1.root.AddLeftChild(n1.root, n2);
        n1.root.AddRightChild(n1.root, n3);
        
        Node n4=new Node(5);
        Node n5=new Node(4);
       
        n1.root.AddRightChild(n2, n5);
        n1.root.AddLeftChild(n2, n4);
        
        Node n6=new Node(6);
        Node n7=new Node(7);
        n1.root.AddLeftChild(n3, n7);
        n1.root.AddRightChild(n3, n6);
        System.out.println("LEVEL - ORDER");
        n1.Level_Order_traversal(n1.root);
       
    }
  
    
    
}