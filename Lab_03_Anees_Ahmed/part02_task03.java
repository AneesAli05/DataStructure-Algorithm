/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_03_Anees_Ahmed;

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
  }
public class part02_task03 {
     ListNode head = null;
     ListNode list1;
     ListNode list2;
        ListNode tail = null;
        if (list1 == null) {
            return list2;
        } 
        if (list2 == null) {
            return list1;
        }
        while (list1 != null && list2 != null) {
            ListNode smaller = list2;
            if (list1.val <= list2.val) {
                smaller = list1;
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
            if (head == null) {
                head = smaller;
            } else {
                tail.next = smaller;
            }
            tail = smaller;
            if (list1 == null) {
                tail.next = list2;
            }
            if (list2 == null) {
                tail.next = list1;
            }
        }
    public static void main(String[] args) {
        
    }
}
