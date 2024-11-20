import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,5,7,1,-1,0,1,-9};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubblesort(int[] arr){
        boolean swaped;

        for(int i=0;i<arr.length;i++){
            swaped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
    
}
