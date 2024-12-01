// import java.util.Arrays;

// public class MergeSort {
//     public static void main(String[] args) {
//         int[]arr={8,7,8,9,5,41,52,33};
//         // System.out.println(Arrays.toString(arr));
//         // arr=mergesort(arr);
//         // System.out.println(Arrays.toString(arr));

//         System.out.println(Arrays.toString(arr));
//         mergesortinplace(arr,0,arr.length);
//         System.out.println(Arrays.toString(arr));
//     }
//     static int[] mergesort(int[]arr){
//         if(arr.length==1){
//             return arr;
//         }
//         int mid =arr.length/2;
//         int[] left= mergesort(Arrays.copyOfRange(arr, 0, mid));
//         int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
//         return merge(left,right);
//     }
//     static int[] merge(int[]left,int[]right){
//         int[] ans=new int[left.length + right.length];

//         int i=0,j=0,k=0;
//         while (i<left.length && j<right.length) {
//             if(left[i]<right[j]){
//                 ans[k]=left[i];
//                 i++;
//             }else{
//                 ans[k]=right[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i<left.length){
//             ans[k]=left[i];
//             i++;
//             k++;
//         }
//         while(j<right.length){
//             ans[k]=right[j];
//             j++;
//             k++;
//         }

//         return ans;

//     }

//     static void mergesortinplace(int[]arr,int s,int e){
//         if(e-s==1){
//             return ;
//         }
//         int mid =s+(e-s)/2;
//         mergesortinplace(arr,s,mid);
//         mergesortinplace(arr, mid, e);
//         mergeinplace(arr, s,mid,e);
//     }
//     static void mergeinplace(int[] arr,int s,int m,int e){
//         int[] ans=new int[e-s];

//         int i=s,j=m,k=0;
//         while (i<m && j<e) {
//             if(arr[i]<arr[j]){
//                 ans[k]=arr[i];
//                 i++;
//             }else{
//                 ans[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i<m){
//             ans[k]=arr[i];
//             i++;
//             k++;
//         }
//         while(j<e){
//             ans[k]=arr[j];
//             j++;
//             k++;
//         }

//         for(int l=0; l<ans.length;l++){
//             arr[s+l]=ans[l];
//         }

//     }
// }
