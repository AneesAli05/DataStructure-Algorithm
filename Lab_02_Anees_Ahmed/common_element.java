/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab02;

/**
 *
 * @author M Sultan
 */
public class common_element {
     public static void main(String[] args) {
        
        String[] words={"abc","bcd","aaaa","cbc"};
        char x='e';
         List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == x) {
                    list.add(i);
                    break;
                }
      }
}
    }
    
}
