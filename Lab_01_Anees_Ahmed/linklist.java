/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
        this.next=null;
    }
    
}
class linkedlist{
    private node head;
    public linkedlist(){
        head=null;
    }
    int insert(int data){
       node newnode=new node(data);
    newnode.next=head;
    
   return data; }
   
    
    
}
public class linklist {
    public static void main(String[] args) {
        node newnode=new node(5);
         linkedlist list=new linkedlist();
         System.out.println(list.insert(25));
         System.out.println(list.insert(12));
    }
}
