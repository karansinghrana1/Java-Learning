public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr ={0,1,2,3,4,5,6,8,7,77,78,789,7894,77777};
        int target = 7;
        int start=0;
        int end=1;

        //finding new start and end

        while(target>arr[end]){
            int newstart=end+1;
            end = end+(end-start+1)*2;
            start=newstart;

        }

        System.out.println(bs(arr,target,start,end));
        
    }

    static int bs(int[] arr,int target,int start, int end){

        while (start<=end) {
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else{
                end=mid-1;
            }
            
        }

        return -1;
    }



    
}
