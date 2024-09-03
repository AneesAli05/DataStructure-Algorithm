/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_lab02;

/**
 *
 * @author M Sultan
 */
public class DSA_LAB02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums={1,2,1};
          int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
    }
    
}
