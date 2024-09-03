/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class prime {
    public static void main(String[] args) {
        int count=0;
     int n=7;
        System.out.println("Enter number :");

        for(int i=1; i<=n; i++){
            if(n%2==0){
                count++;
                 System.out.print(" "+i);
            }
          
        }
        
         
        
        System.out.println();
            if(count==2){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        
    }
}
