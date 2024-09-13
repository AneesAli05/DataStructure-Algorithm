/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_03_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */

  //Definition for singly-linked list.
   class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) {
          val = x;
          next = null;
      }

   }
public class Part_02_Task01 {
        static ListNode1  getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        
        ListNode1 currentNode1 = headA;
        ListNode1 currentNode2 = headB;
        int input = 8;
        int skipA = 0;
        int skipB = 0;
        
        while(currentNode1 != null){
            if(currentNode1.val == input) {
                
                break;
            }
            
            skipA++;
            currentNode1 = currentNode1.next;
        
        }
        
        while(currentNode2 != null){
            if(currentNode2.val == input) {
               
                break;
            }
             skipB++;
            currentNode2 = currentNode2.next;
        }
        
        
        while(currentNode1!=null){
            if(currentNode1.val!=currentNode2.val){
                return null;
            }
            else{
                System.out.print(currentNode1.val+" headA Same Elements in headB :"+currentNode2.val);
                System.out.println();
            }
            
            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
        }
        
        ListNode1 intersect= new ListNode1(skipA);
        intersect.next = new ListNode1(skipB);
        return intersect;
       
        }
    public static void main(String[] args) {
        ListNode1 headA=new ListNode1(4);
        headA.next=new ListNode1(1);
        headA.next.next=new ListNode1(8);
        headA.next.next.next=new ListNode1(4);
        headA.next.next.next.next=new ListNode1(5);
        
        
        ListNode1 headB = new ListNode1(5);
        headB.next=new ListNode1(6);
        headB.next.next=new ListNode1(1);
        headB.next.next.next=new ListNode1(8);
        headB.next.next.next.next=new ListNode1(4);
        headB.next.next.next.next.next=new ListNode1(5);
             
       ListNode1 list = getIntersectionNode(headA, headB);
        while(list != null){
        System.out.println(list.val);
        list = list.next;
        } 
       
    
    }
}
