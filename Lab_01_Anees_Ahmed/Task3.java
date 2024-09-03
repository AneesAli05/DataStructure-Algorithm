/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class Task3 {
    public static void main(String[] args) {
        int []array=new int[5];
        array[0]=8;
        array[1]=16;
        array[2]=24;
        array[3]=32;
        array[4]=40;
        System.out.println("before deletion");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int index =2;
        
       for(int i=index; i<array.length-1;i++){
           array[i]=array[i+1];
       }
       array[array.length-1]=0;
        System.out.println("After deletion");
       for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
       }
      
    }
}
