package Lab_06_Anees_Ahmed;
import java.util.Arrays;

public class Part02_Task01 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
            for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
            
          Arrays.sort(nums1); // Sorting 
          
//         Printing
    for(int i = 0; i < nums1.length; i++){
        System.out.print(nums1[i] + " ");
    }
        
        }

    public static void main(String[] args) {
        
        int []nums1 = {1};
        int []nums2  = {};
        int m = 1;
        int n = 0;
        new Part02_Task01().merge(nums1, m, nums2, n);
    }
}
