import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args){
        int[] arr= {2,8,9,7,5};
        int max1=arr[1];
        int max2=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max2=max1;
                
            }
        }

    }
    
}





