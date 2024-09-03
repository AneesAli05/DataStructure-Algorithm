/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author anees
 */
public class Task5 {
    public static void main(String[] args) {
        int array[]={1,3,5,7,9};
        System.out.println("Before reverse");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("After reverse");
    for(int i=array.length-1;i>=0; i--){
        System.out.print(array[i]+" ");
    }
    
    }
}
