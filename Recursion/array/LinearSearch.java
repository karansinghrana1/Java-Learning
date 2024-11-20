
// public class LinearSearch {
//     public static void main(String[] args) {
//         int[]arr={1,5,8,9,10};
//         int target=10;
//         System.out.println(search(arr, target, 0));
//         System.out.println(searchindex(arr, target, 0));
//     }
//     static boolean search(int[]arr,int target,int i){
//         if(i==arr.length){
//             return false;
//         }
//         return arr[i]==target || search(arr, target, i+1);
//     }
//     static int searchindex(int[]arr,int target,int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==target){
//             return i;
//         }
//         return searchindex(arr, target, i+1);
//     }
// }
