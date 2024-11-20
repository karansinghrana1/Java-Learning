// // package Recursion;

// public class BinarySearch {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,9,78,75,444};
//         int target=43;
//         System.out.println(bs(arr, 0, arr.length-1, target));
//     }
//     static int bs(int[] arr,int start,int end,int target){
        
//         if(start>end){
//             return -1;
//         }
//         int mid=start+(end-start)/2;
//         if(arr[mid]==target){
//             return mid;
//         }
//         if (arr[mid]>target) {
//             return bs(arr, start, mid-1, target);
//         }
//         return bs(arr, mid+1, end, target);
//     }
// }
