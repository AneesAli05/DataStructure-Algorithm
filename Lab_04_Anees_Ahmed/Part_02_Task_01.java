/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_04_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */

     class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  
 public class Part_02_Task_01 {
    //public static void main(String[] args) {
        ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode current=head;
        while(current!=null && current.next!=null){
            temp=temp.next;
            current=current.next.next;
        }
        return temp;
    }
}
//}
}