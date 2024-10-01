/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_06_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
public class part02_task03 {
    public char findTheDifference(String s, String t) {
        
        
    return t.charAt(t.length() - 1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        
        System.out.println(new part02_task03().findTheDifference(s, t));
    }
}
