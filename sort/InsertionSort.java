import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
    int[] var1 = new int[]{5, 4, 5, 7, 1, -1, 0, 1, -9};
      insertion(var1);
      System.out.println(Arrays.toString(var1));
    }
    static void insertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
            
        }
    }
    static void swap(int[] var0, int var1, int var2) {
        int var3 = var0[var1];
        var0[var1] = var0[var2];
        var0[var2] = var3;
     }
    
}
