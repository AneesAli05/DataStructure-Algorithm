/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_05_Anees_Ahmed;
import java.util.*;
/**
 *
 * @author M Sultan
 */
public class part02_task03 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length, n2 = nums2.length;
        int[] res = new int[n];

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i : nums2) {
            while(!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            } 
            stack.push(i);
        }

        for(int i=0; i<n; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
}
    }