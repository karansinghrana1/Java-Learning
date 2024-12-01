// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class QuickSort {
//     public static void main(String[] args) {
//         int[]arr={85,1,2,3,1,5,6,88,77,74,447,622};
//         System.out.println(Arrays.toString(arr));
//         qs(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void qs(int[] arr,int low,int high){
//         if(low>high)return;
//         int s=low,e=high;
//         int m=s+(e-s)/2;
//         int pivot= arr[m];

//         while(s<=e){
//             while (arr[s]<pivot) {
//                 s++;
//             }
//             while (arr[e]>pivot) {
//                 e--;
//             }

//             if(s<=e){
//                 int temp=arr[s];
//                 arr[s]=arr[e];
//                 arr[e]=temp;
//                 s++;
//                 e--;
//             }
//         }

//         qs(arr, low, e);
//         qs(arr, s, high);
//     }
// }
