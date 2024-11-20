import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 2, 89, 77, 56};

        System.out.println(Arrays.toString(arr));
        sort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col,int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) { // Correct comparison between adjacent elements
                sort(arr, row, col + 1,col);
            }
            else{
                sort(arr, row, col + 1,max);
            }
            
        } else {
            int temp=arr[row-1];
            arr[row-1]=arr[max];
            arr[max]=temp;
            sort(arr, row - 1, 0,0); // Restart with the next row
        }
    }
}
