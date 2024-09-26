/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05_Anees_Ahmed;

/**
 *
 * @author M Sultan
 * 
 */
public class Stack {
    int maxSize;
     int top;
     int[] arr;
    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }
    public void push(int element) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            arr[top] = element;
            System.out.println("element push" + element);
        }
    }
     void displayStack() {
        if (top < 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("total elements:");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    int peek() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[top];
        }
    }
    int pop(){
       int current=top;
       if(current==-1){
           System.out.println("Stack Empty");
       return arr[top--];}
       else{
           return arr[top--];
       }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack(); 
        stack.displayStack();
        System.out.println( stack.peek());
    }
 }


