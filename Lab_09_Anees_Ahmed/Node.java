/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_09_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
public class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
  this.data=data;
  this.left=this.right=null;
  
}
public void AddChildLeft(Node parent, Node child){
    parent.left=child;
}
public void AddChildRight(Node parent, Node child){
    parent.right=child;
}
}
