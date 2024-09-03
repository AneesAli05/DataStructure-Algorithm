/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;
import java.util.*;
/**
 *
 * @author M Sultan
 */
public class Task7 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        return Arrays.equals(str1.toLowerCase().toCharArray(), str2.toLowerCase().toCharArray());
    }
}