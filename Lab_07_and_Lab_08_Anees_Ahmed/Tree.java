/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_07_and_Lab_08_Anees_Ahmed;


 class TNode{
String data;
TNode[] children;
    int childCount;
    TNode(String val, int NumChild){
        data = val;
        children = new TNode[NumChild];
        childCount = 0;

    }   
     public void addChild(TNode child){
         if(this.childCount<children.length){
            children[childCount++]=child;
             System.out.println(" Child added ");   
         }
     else{
     System.out.println(" Child not added");
}

 }
     int count=0;
    
      public void display(){
         
       System.out.print(this.data+" ");
       for(int i=0; i<this.childCount;i++){
           children[i].display();
           
       }
          }
      public int size(){
       for(int i=0; i<this.childCount;i++){
           count++;
           
       }
          System.out.println("");
          return count;}
      int edges(){
          return count-1;
      }
          
 }

public class Tree {

    TNode root;

    Tree(String val, int NumChild){
        root= new TNode(val , NumChild);
        System.out.println("Tree created with Node "+ val);

    }

         
           
  
 public static void main(String[] args) {
      Tree A = new Tree ("A",2);
      TNode B = new TNode("B",3);
      TNode C = new TNode("C",2);
      A.root.addChild(B);
      A.root.addChild(C);
      A.root.display();
     System.out.println( "Total Iterations "+A.root.size());
     System.out.println("Total edges are "+A.root.edges());
       

       
 }
    }
