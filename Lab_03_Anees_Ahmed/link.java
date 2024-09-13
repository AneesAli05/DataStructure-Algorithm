
package Lab_03_Anees_Ahmed;
class Node{
    int data;
    Node next;
    

}

class LinkedList{
    private Node head;
    
    LinkedList(){
        this.head = null;
    }
    boolean isListEmpty(){
        return this.head == null;
    }
    
    void traverse(){
        Node currentNode = this.head;
        int i = 0;
        System.out.println("\nPrinting list\n");
        while(currentNode != null){
            System.out.println("Linked list " + (i + 1) + " elelment is: " + currentNode.data);
            currentNode = currentNode.next;
            i++;
        }
        System.out.println("");
    }
    
    
    void insertAtHead(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        System.out.println(data + " inserted at head Successfully");
    }
    
    
    void insertAtTail(int data){
        Node newNode = new Node();
        newNode.data = data;
        Node currentNode = this.head;
        Node tempNode = this.head;
        while(currentNode != null){
            tempNode = currentNode;
            currentNode = currentNode.next;
        }
        tempNode.next = newNode;
        System.out.println(data + " inserted at Tail successfully");
//        newNode.next = null;
    }
    
    void insertAtIndex(int data, int index){
        Node newNode = new Node();
        newNode.data = data;        
        Node currentNode = this.head;
        int i = 0;
        while(i != index - 1){
            currentNode = currentNode.next;
            i++;
        }        
        newNode.next = currentNode.next;
        currentNode.next = newNode;       
        System.out.println(newNode.data +" inserted at index " + index + " index successfully");       
    }    
    void insertByValue(int data, int value){
          Node newNode = new Node();
        newNode.data = data; 
        Node currentNode = this.head;
        while(currentNode.data != value){
            currentNode = currentNode.next;}
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }    
    void deleteHeadNode(){
        Node tempNode = this.head;
        head = head.next;
        
        System.out.println(tempNode.data + " deleted from linked list successfully");
        tempNode = null;
    }    
    void deleteTailNode(){
        Node tempNode = this.head;
        Node currentNode = this.head;
        
        while(tempNode.next != null){
            currentNode = tempNode;
            tempNode = tempNode.next;
        }      
        currentNode.next = null;
          System.out.println(tempNode.data + " deleted from tail successfully");
        
    }
    
    void deleteAtIndex(int index){
        Node currentNode = this.head;
        Node tempNode = this.head;
        int i = 0;
        while(i != index){
            currentNode = tempNode;
            tempNode = tempNode.next;
            i++;
        }
        currentNode.next = tempNode.next;
        System.out.println(tempNode.data + " deleted successfully from index " + index);
    }
    
    void deleteByValue(int value){
        Node CurrentNode= this.head;
        Node TempNode= CurrentNode.next;
        
        while(CurrentNode.data!=value){
        CurrentNode=TempNode;
        TempNode=TempNode.next;
        }
        CurrentNode.next=TempNode.next;
        CurrentNode.data=TempNode.data;
        
        
    }
    
    
    
    void reverse(){
      Node currentNode=this.head;
      Node prevNode=null;
      Node next=null;
      while(currentNode !=null){
          next=currentNode.next;
          currentNode.next=prevNode;
          prevNode=currentNode;
          currentNode=next;
           
      } 
      head=prevNode;
          }
int countNodes(){
    Node current=this.head;
    int count=0;
    while(current!=null){
        count++;
        current=current.next;
    }
return count;}      
      
  }       


public class link {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
        
    for(int i = 5; i > 0; i-- ){
        list.insertAtHead(i);
    }
        
        System.out.println(list.isListEmpty());
        list.traverse();
        list.insertAtTail(6);
        list.traverse();
        list.insertAtHead(1000);
        
        list.deleteHeadNode();
        list.traverse();
        
        list.deleteTailNode();
        list.traverse();
        
        list.insertAtIndex(100, 2);
        list.traverse();
        
        list.deleteAtIndex(2);
        list.traverse();
        
        list.insertByValue(200, 3);
        list.traverse();
        
        list.deleteByValue(200);
        list.traverse();
    
        list.reverse();
        list.traverse();
    
        System.out.println("Total Nodes are in Linked List :"+list.countNodes());
    
    }
}
