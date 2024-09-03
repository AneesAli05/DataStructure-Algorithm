/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class Task4part3 {
    public static void main(String[] args) {
        int array []={11,22,33,44,55};
        int value=33;
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
      for(int i=0; i<array.length;i++){
           if(array[i]==value){
               System.out.println("Element "+value+" found at index :"+i);
           }
                  
        }
    }
}
