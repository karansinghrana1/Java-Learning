// public class RotatedBinatySearch {
//     public static void main(String[] args) {

//         int[] arr={4,5,6,7,0,1,2};
//         // System.out.println(pivot(arr));
        
//     }

//     static int search(int[] nums,int target){
//         int pivot= findpivot(nums);
//         if(pivot==-1){
//             bs(nums,target,0,nums.length-1);
//         }
//         if(nums[pivot]==target){
//             return pivot;
//         }
//         if(target>=nums[0]){
//             return bs(nums, target, 0, pivot-1);
//         }
//         return bs(nums, target, pivot+1, nums.length -1);



//     }

//     static int findpivot(int[] arr){
//         int start=0;
//         int end = arr.length-1;

//         while (start<=end) {
//             int mid=start+(end-start)/2;
//             if(mid<end && arr[mid]>arr[mid+1] ){
//                 return mid;
//             }
//             else if(mid>start && arr[mid]<arr[mid-1]){
//                 return mid-1;
//             }
//             else if(arr[mid]<=arr[start]){
//                 end = mid-1;
//             }
//             else{
//                 start=mid+1;
//             }


//         }

//         return -1;
//     }

//     static int findpivotwithduplicate(int[] arr){
//         int start=0;
//         int end = arr.length-1;

//         while (start<=end) {
//             int mid=start+(end-start)/2;
//             if(mid<end && arr[mid]>arr[mid+1] ){
//                 return mid;
//             }
//             if(mid>start && arr[mid]<arr[mid-1]){
//                 return mid-1;
//             }
//             //changes - if elements at mid start end are equal just skip duplicated
//             if(arr[mid]==arr[start] && arr[mid]==arr[end]){
//                 //skip duplicated

//                 //what if this at start and end were the pivot?
//                 if(arr[start]>arr[start+1]){
//                     return start;
//                 }
//                 start++;

//                 if(arr[end]<arr[end-1]){
//                     return end - 1;
//                 }
//                 end--;
//             }
//             else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }


           
//         }

//         return -1;
//     }

//     static int bs(int[] arr,int target,int start,int end){
//         while (start<=end) {
//             int mid = start + (end - start)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(arr[mid]<target){
//                 start =mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
            
//         }

//         return -1;
//     }
    
// }
