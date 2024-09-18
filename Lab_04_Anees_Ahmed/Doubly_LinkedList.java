/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_04_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class Doubly_LinkedList {
    //private Node head;  
    private Node head;
    private Node tail;

    public Doubly_LinkedList() {
        head = null;
        tail = null;
    }

    // Insert at the beginning
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
   
             newNode.prev=tail;
            tail=newNode;
        }
    }

    public void traverseList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void deleteAtStart() {
        if (head == null) {
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void insertAtMiddle(int data, int position) {
        if (position < 1 || position > countNodes() + 1) {
            System.out.println("Invalid position!");
            return;
        }
        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
          newNode.next = current.next; 
      
        newNode.prev = current;
        current.next.prev = newNode;
        current.next= newNode;
    }

    public void updateAtStart(int data) {
        if (head == null) {
            return;
        }
        head.data = data;
    }

    private int countNodes() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Doubly_LinkedList list=new Doubly_LinkedList();
        list.insertAtStart(25);
        list.insertAtStart(10);
        list.insertAtMiddle(25, 2);
        list.deleteAtEnd();
        list.insertAtEnd(35);
        list.traverseList();
        list.updateAtStart(40);
    }
}