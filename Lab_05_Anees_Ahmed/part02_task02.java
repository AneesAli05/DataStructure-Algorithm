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
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class part02_task02 {
   
    public boolean isPalindrome(Node head) {
        if(head.next == null) return true;

        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;Node prev = null;
        Node curr = slow;
        Node nnext = slow.next;

        while(nnext != null) {
            curr.next = prev;

            prev = curr;
            curr = nnext;
            nnext = nnext.next;
        }

        curr.next = prev;
        temp = head;
        while(curr != null && temp != null) {
            if(curr.val != temp.val) {
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }

   
return true;}
}
    