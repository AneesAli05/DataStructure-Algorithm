/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_06_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
public class Queue_Array {
    int []array;
    int size;
    int rear;
    int capacity;
    int front;
    Queue_Array(int cap){
        this.capacity=cap;
        this.array=new int[capacity];
        this.front=this.rear=this.size=0;
    }
    boolean isFull(){
        return size==capacity;
    }
    void Enqueue(int data){
       if(isFull()){
        System.out.println(" Queue Overflow");;
    return ;}
       else{
           array[rear]=data;
           rear=(rear+1);
           size++;
       }
      }
    boolean isEmpty(){
        return size==-1;
    }
     int Dequeue(){
         int temp=array[front];
        if(isEmpty()){
         System.out.println(" Queue Underflow");
        return -1;}
        else{
          front=(front+1);
     size--;
            
        }
     return temp;   
}
     void traverse(){
         int temp=front;
         for(int i=0;i<size; i++){
             System.out.print(array[temp]+" ");
            temp=(temp+1);
         }
     }
     
    public static void main(String[] args) {
        Queue_Array list=new Queue_Array(5);
        list.Enqueue(2);
        list.Enqueue(4);
        list.Enqueue(6);
        list.Enqueue(8);
        list.traverse();
       // list.Enqueue(10);
        System.out.println(list.isFull());
        System.out.println(list.isEmpty());
        System.out.println(list.Dequeue());
        list.traverse();
    
    }
}
