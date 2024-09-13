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

public class Part02_Task02 {
    private ListNode head;
    Part02_Task02(){
        this.head=null;
    }
    if(head== null || head.next == null) return head;

    ListNode temp = head;
    while(temp != null && temp.next != null){
        if(temp.val == temp.next.val){
          temp.next = temp.next.next;
        }else{
          temp = temp.next;
        }
      }
    public static void main(String[] args) {
        
    }
}
