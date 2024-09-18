/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_04_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
public class Part_02_Task_02 {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public int getDecimalValue(ListNode head) {
        int res =head.val;
        while(head.next!=null){
            res=res*2+head.next.val;
            head=head.next;
        }
        return res;
    }
}
}
