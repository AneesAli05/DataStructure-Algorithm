/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class common {
    public static void main(String[] args) {
        int nums1[]={2,3,2};
        int nums2[]={1,2};
        int common=0;
        int common2 = 0;
        for(int i=0; i<nums1.length;i++){
            for(int j=0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    common = nums1[i];
                    common2 = j;
                    break;
                }
            }
        }
            System.out.print(common);
            System.out.println(common2);
    }
}
