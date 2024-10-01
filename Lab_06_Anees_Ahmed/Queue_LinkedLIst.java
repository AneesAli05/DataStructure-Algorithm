/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_06_Anees_Ahmed;

import Lab_05_Anees_Ahmed.Node;

/**
 *
 * @author M Sultan
 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        
    }
}
public class Queue_LinkedLIst {
    private Node head;
    private Node tail;
    Queue_LinkedLIst(){
        this.head=null;
        this.tail=null;
        }
    boolean isEmpty(){
        return head==null;
    }
    void Enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            tail=head=newNode;
            return;
        }else{
            tail=newNode;
            tail=tail.next;
            return;
        }
      }

    int Dequeue(){
         
        Node front=head;
        head=front.next; 
          return front.data;
    }
    void traverse(){
          Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ->");
           temp=temp.next; 
        }

    }
    public static void main(String[] args) {
        Queue_LinkedLIst list=new Queue_LinkedLIst();
        list.Enqueue(1);
        list.Enqueue(3);
        System.out.println(list.Dequeue());
        list.Enqueue(5);
        System.out.println(list.isEmpty());
        list.Enqueue(7);
        System.out.println(list.Dequeue());
        list.traverse();
    }
}
