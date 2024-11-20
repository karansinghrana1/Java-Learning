import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {

        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=10;
        System.out.println(Arrays.toString(search(arr, target)));
        
    }
    static int[] bs(int[][] matrix,int row,int scol,int ecol,int target){
        while(scol<=ecol){
            int mid=scol+(ecol-scol)/2;
            if(matrix[row][mid]==target){
               return new int[]{row,mid}; 
            }
            else if (matrix[row][mid]<target){
                scol=mid+1;
            }
            else{
                ecol=mid-1;
            }

        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][]matrix,int target){
        int row=matrix.length;
        int col =matrix[0].length;//matrix may be empty
        if(row==1){
            return bs(matrix, 0, 0, col-1, target);
        }

        int srow=0;
        int erow=row-1;
        int mcol=col/2;

        while(srow<(erow-1)){
            int mid=srow+(erow-srow)/2;
            if(matrix[mid][mcol]==target){
               return new int[]{mid,mcol}; 
            }
            else if (matrix[mid][mcol]<target){
                srow=mid;
            }
            else{
                erow=mid;
            }
        }
        if(matrix[srow][mcol]==target){
            return new int[]{srow,mcol}; 
        }
        //ye dekh lena
        if(matrix[srow+1][mcol]==target){
            return new int[]{srow+1,mcol}; 
        }

        if(target<=matrix[srow][mcol-1]){
            return bs(matrix, srow, 0, mcol-1, target);
        }
        if(target>=matrix[srow][mcol+1] && target<=matrix[srow][col-1]){
            return bs(matrix, srow, mcol+1, col-1, target);

        }
        if(target<=matrix[srow+1][mcol-1]){
            return bs(matrix, srow+1, 0, mcol-1, target);

        }
        else{
            return bs(matrix, srow+1, mcol+1, col-1, target);

        }


    }
}
