/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class Sentences {
    public static void main(String[] args) {
        String sentences[]={"Anees ahmed Artificial Intelligence","Ahtesham aslam ", "Asim Raza junejo","I am muhammad Bilal abro zameeny hain "}; 
        
    int arr[] = new int[sentences.length];
    int count=0;
    for(int i=0; i<sentences.length; i++){
        
    String [] array=sentences[i].split(" ");
    for(String s: array){
        count++;
    }
    arr[i]= count;
       System.out.println(count);
       count = 0;
    }
        System.out.println();
    int max = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max)
            max = arr[i];
    }
    
        System.out.println("The maximum number is :"+max);
    
    
    
    
    
    
    
    }
}
