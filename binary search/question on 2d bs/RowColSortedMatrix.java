import java.util.Arrays;

public class RowColSortedMatrix {
    public static void main(String[] args){

        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=39;
        System.out.print(Arrays.toString(search(arr,target)));


    }

    static int[] search(int[][] matrix,int target){
        int row=0;
        int col = matrix.length -1;

        while (row<matrix.length-1 && col>=0) {
             if(matrix[row][col]==target){
                return new int[]{row,col};
             }
             else if(matrix[row][col]<target){
                row++;
             }
             else{
                col--;
             }
            
        }

        return new int[]{-1,-1};

    }
    
}
