///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Lab_03_Anees_Ahmed;
//
///**
// *
// * @author M Sultan
// */
//
//  class LinkedList4{
//  private  Node head;
// 
//    class Node{
//    int data;
//    Node next;
//    
//    Node(int data){
//        this.data=data;
//        this.next=null;
//       
//    }
//
//}
//      
//    
//     void InsertAtStart(int data){
//        Node newnode=new Node(data);  
//        if(head==null){
//           newnode=this.head;  
//        }
//        else{
//            Node current=head;
//          while (current!=null){
//              current =current.next;
//          }   current.next=newnode;
//              
//        }
//    } 
//    void printlist(){
//        Node current=head;
//        while(current!=null){
//            System.out.println(current.data+" ");
//            current.next=current;
//        }
//        System.out.println();
//    }
//     
//void insertatLast(int adLast){
//  Node newnode=new Node(adLast);
//    if(head==null){
//        head=newnode;
//    }
//    Node current =head;
//    while(current!=null){
//        current.next=current;
//    
//    }
//    current.next=newnode;
//    
//}
//void DeleteAtStart(int delAtLast){
// Node newnode=new Node(delAtLast);
// Node current=head;
// while(current!=null){
//    
//     
// }
//}
// void InsertAtMiddle(int data){
//    Node newnode=new Node(data);
// 
//    Node current =head;
//    if(head==null){
//        head=newnode;
//    }
//    else{
//        
//    }    
//}
//  }
//   public class Testing {
//    public static void main(String[] args) {
//        
//      LinkedList4 list=new LinkedList4();
//      
//      list.InsertAtStart(1);
//      list.printlist();
//      list.insertatLast(5);
//      list.printlist();
//      list.DeleteAtStart(1);
//    }
//
//    
//}
//  