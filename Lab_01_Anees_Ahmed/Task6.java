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
public class Task6 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println(input + "  palindrome.");
        } else {
            System.out.println(input + " not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
