/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_09_Anees_Ahmed;

import java.util.*;

class BT {

    
    Node root;
    int size;
    int rightCount; 
    int leftCount;
    
    int getSize(){return this.size;}
    int rightCount(){return rightCount;}
    int leftCount(){return leftCount;}

    BT() {
        this.root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            System.out.println(value + " inserted at root");
            this.size++;
            return;
        }

        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (value < current.data) {
                current = current.left;
                if (parent.left == null) {
                    parent.left = new Node(value);
                    System.out.println(value + " inserted at left");
                    this.size++;
                    leftCount++;
                    return;
                }
               
            } else {
                current = current.right;
                if (parent.right == null) {
                    parent.right = new Node(value);
                    System.out.println(value + " inserted at right");
                    this.size++;
                    rightCount++;
                    return;
                }

            }

        }
    }

    boolean search(int value) {
        Node cur = root;

        while (cur != null && cur.data != value) {
            if (value < cur.data) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur != null;
    }

    void In_Order(Node root) {
        if (root == null) {
            return;
        }
        In_Order(root.left);
        System.out.print("  " + root.data);
        In_Order(root.right);
    }

    void Post_Order(Node root) {
        if (root != null) {
            Post_Order(root.left);
            Post_Order(root.right);
            System.out.print("  " + root.data);
        }

    }

    void Pre_Order(Node root) {
        if (root != null) {
            System.out.print("  " + root.data);
            Pre_Order(root.left);
            Pre_Order(root.right);

        }

    }

    void Level_Order(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tnode = queue.remove();
            System.out.print("  " + tnode.data);
            if (tnode.left != null) {
                queue.add(tnode.left);
            }
            if (tnode.right != null) {
                queue.add(tnode.right);
            }

        }
    }
    

}

public class Binary_Search_Tree {

    public static void main(String[] args) {

        BT bt = new BT();
        bt.insert(5);
        bt.insert(3);
        bt.insert(8);
        bt.insert(4);
        bt.insert(11);
        bt.insert(10);
        System.out.println("");
        System.out.println("Nodes in Tree " + bt.getSize());
        System.out.println("LevelOrder");
        bt.Level_Order(bt.root);
        System.out.println(""); 
      System.out.println("In Order");
        bt.In_Order(bt.root);
        System.out.println("");
        System.out.println("Pre Oreder");
        bt.Pre_Order(bt.root);
        System.out.println(""); 
         System.out.println("Post Order");
        bt.Post_Order(bt.root);
        System.out.println(""); 
         System.out.println("Total Left Nodes "+bt.leftCount);
         System.out.println("Total Right Nodes "+bt.rightCount);
         System.out.println(" "+bt.search(4));
    }

}
