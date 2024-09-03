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
public class Task2part2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
          int [] array={100,200,300,400,500,0};
        System.out.println("before insertion");
        for(int i=0; i<array.length;i++){
            
            System.out.print(array[i]+" ");
        }
        int index =2;
        int value=250;
        
        for(int i=array.length-1;i>index; i--){
            array[i]=array[i-1];
        }
     array[index]=value;
        System.out.println();
        System.out.println("After insertion");
        
        for(int i=0; i<array.length;i++){
            
            System.out.print(array[i]+" ");
        }
    }
}
