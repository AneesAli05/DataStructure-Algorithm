package Lab_06_Anees_Ahmed;
public class Part02_Task02 {
     public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[2];
//        int j = 0;
         for(int i=0; i<nums1.length - 1;  i++){
           if(nums2[0] == nums1[i] && nums2[1] == nums1[i + 1]){
               arr[0] = nums1[i];
               arr[1] = nums1[i + 1];
           }
        }
         
         return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        
        int[] arr = new Part02_Task02().intersect(nums1, nums2);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
