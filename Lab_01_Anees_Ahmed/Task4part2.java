/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class Task4part2 {
    public static void main(String[] args) {
        int array[]={4,6,2,8,10};
        int value=8;
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0; i<array.length;i++){
            if(array[i]==value){
                System.out.println("Element "+value+" Found at index :"+i);
            break;}
        }
    }
 
}
