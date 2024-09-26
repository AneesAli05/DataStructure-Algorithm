/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
class Node{
    int data;
    Node next;
    int max;
    Node(int data){
        this.data=data;
        this.next=null;
        max = -1;
    }
}
public class StachLinkedList {
    private Node top;
    
    StachLinkedList(){
    this.top=null;
    }
    boolean isEmpty(){
        return top==null;
    }
    void push(int data){
    Node newNode=new Node(data);    
    if(top==null){
        top=newNode;
    return;
    }
    else{
        newNode=newNode.next;
        top=newNode;
        }
     }
    void display(){
        Node current=top;
        if(top==null){
           return;
        }
        while(current!=null){
            System.out.println(current.data+" ->");
            current=current.next;
        }
        
    }
}
public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow.");
            return -1;
        } else {
            return arr[top--];
        }
    }