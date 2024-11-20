import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
         int[] arr={5,4,5,7,1,-1,0,1,-9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int maxindex=getmax(arr,0,last);
            swap(arr, maxindex, last);
        }
    }
    static int getmax(int[]arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
