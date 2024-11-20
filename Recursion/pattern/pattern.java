// import java.util.Arrays;

// public class BubbleSort {
//     public static void main(String[] args) {
//         int[] arr = {1, 8, 9, 2, 89, 77, 56};

//         System.out.println(Arrays.toString(arr));
//         Bubble(arr, arr.length - 1, 0);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void Bubble(int[] arr, int row, int col) {
//         if (row == 0) {
//             return;
//         }
//         if (col < row) {
//             if (arr[col] > arr[col + 1]) { // Correct comparison between adjacent elements
//                 int temp = arr[col];
//                 arr[col] = arr[col + 1];
//                 arr[col + 1] = temp;
//             }
//             Bubble(arr, row, col + 1);
//         } else {
//             Bubble(arr, row - 1, 0); // Restart with the next row
//         }
//     }
// }
