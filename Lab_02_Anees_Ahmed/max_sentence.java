/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab02;

/**
 *
 * @author M Sultan
 */
public class max_sentence {
    public static void main(String[] args) {
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
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
    }
}
