/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_06_Anees_Ahmed;

/**
 *
 * @author M Sultan
 */
public class bubble_sort {
    public static void BubbleSort(int[] arr) {
        boolean swapped;
        int operation_count=0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                operation_count++;}
            }
            
            if (!swapped) {
                break;   }
        }
    System.out.print("Total operation " + operation_count);}
    public static void main(String[] args) {
        int[] arr = {65, 55, 8, 15, 51, 21, 4};
        BubbleSort(arr);
        System.out.println(" Sorted arrays are :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

