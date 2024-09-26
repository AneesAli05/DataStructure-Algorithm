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
public class part02_task01 {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                list.add(ch);
            }
            else{
                if(list.size()<1){
                    return false;
                }
                if(!check(list.get(list.size()-1),ch)){
                    return false;
                }
                else{
                    list.remove(list.size()-1);
                }
            }
        }
        if(list.size()>0){
            return false;
        }
        return true;
    }
    private boolean check(char ch, char ch1){
        if(ch=='{' && ch1=='}' || ch=='(' && ch1==')' || ch=='['&&ch1==']'){
            return true;
        }
        return false;
    }
}

