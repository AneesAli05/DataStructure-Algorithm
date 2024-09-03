/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;


/**
 *
 * @author M Sultan
 * 
 */
public class Task2part1 {
    public static void main(String[] args) {
          int [] array=new int[6];
          array[0]=12;
           array[1]=24;
            array[2]=36;
             array[3]=48;
              array[4]=60; 
              array[5]=0;
               System.out.println("Before Insertion");
       for(int i=0; i<array.length;i++){
           System.out.print(array[i]+" ");
       }
       
       int num=6;
       int index=0;
       
       
       for(int i=array.length-1;i>0;i--){
        array[i]=array[i-1];
          
       }
       array[index]=num;
        System.out.println();
        System.out.println("After Insertion"); 
       for (int i=0; i<array.length;i++){
           System.out.print(array[i]+" " );
       }
        }
    
}
