/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab02;

/**
 *
 * @author M Sultan
 */
class pair_diffrent {
      public static void main(String[] args) {
        int[] nums={1,2,2,1};
         int k=1;
         int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]==k+nums[i]||nums[j]==nums[i]-k){
                    count++;
                }
            }
        }
    }
}
