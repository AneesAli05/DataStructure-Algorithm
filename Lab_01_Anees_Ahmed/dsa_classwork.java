/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.day1;

/**
 *
 * @author M Sultan
 */
public class dsa_classwork {
    public static void main(String[] args) {
        
       int[][]matrix={{1,2,3},
                       {4,5,6},
                      {7,8,9}};
       int rows=matrix.length;
       
       int col=matrix[0].length;
               
       
       
       
       for(int i=rows-1;i>=0; i--){
           for(int j=col-1; j>0; j--){
              matrix[i][j]=matrix[i][j-1];
                     System.out.print(matrix[i][j]);
       }
           System.out.println();
       if(i>0){
          
       }
       }
    
    
    }
}
