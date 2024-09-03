/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class dsaLABcommon {
    public static void main(String[] args) {
        int []num1={4,3,2,3,1};
        int []num2={2,2,5,2,3,6};
        int common=0;
        int common1=0;
        for(int i=0; i<num1.length;i++){
            for(int j=0; j<num2.length; j++){
                if(num1[i]==num2[j]){
                    common++;
                    break;
                    
                }
            }
        }
        for(int i=0; i<num2.length; i++){
            for(int j=0; j<num1.length; j++){
                if(num2[i]==num1[i]){
                    common1++;
                    break;
                }
            }
        }
    }
}
