/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

import java.util.Scanner;

/**
 *
 * @author M Sultan
 */
public class Task2part3 {
    public static void main(String[] args) {
         int [] array={3,6,9,12,15,0};
        
        int index =5;
        int value=18;
        System.out.println("before insertion ");
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");                   ;
            
        }
         array[index]=value;
        System.out.println("/nAfter insertion");
       
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");                   ;
            
        }
    }
}
