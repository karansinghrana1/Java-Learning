public class Ceiling {
    public static void main(String[] args) {

        int[] arr ={1,2,4,5,6,8,14,15,79};
        int target=13;

        System.out.println(ans(arr, target));
        
    }

    static int ans(int[] arr,int target){

        int start =0;
        int end = arr.length -1;

        

        while(start<=end){
            int mid=start +(end-start)/2;

            if(arr[mid]==target){
                return mid;

            }
            else if (arr[mid]<target){
                start= mid+1;
            }
            else{
                end=mid-1;
            }

            
        }
        return arr[start];


    }
}
