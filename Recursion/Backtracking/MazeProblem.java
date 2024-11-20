import java.util.*;
public class MazeProblem {
    public static void main(String[] args) {
        // System.out.println(CountWays(3, 3));
        // PathPrint("", 4, 4);
        // System.out.print(PathInArr("", 4, 4));
        // System.out.print(PathDiagonal("", 4, 4));
        // boolean[][] maze={
        //     {true,true,true},
        //     {true,false,true},
        //     {true,true,true},
        // };
        // System.out.println(PathWithObstical("", maze, 0, 0));
        // boolean[][] maze={
        //     {true,true,true},
        //     {true,true,true},
        //     {true,true,true},
        // };
        // System.out.println(PathAllDirection("", maze, 0, 0));
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int[][]path=new int[maze.length][maze[0].length];
        System.out.println(PathWithMatrix("", maze, 0, 0,path,1));
    }   
    static int CountWays(int row,int col){
       if (col==1 || row==1) {
            return 1;
       } 
       int left = CountWays(row-1, col);
       int right = CountWays(row, col-1);
       return left+right;
    }

    static void PathPrint(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            PathPrint(p+'D', row-1, col);
        }
        if(col>1){
            PathPrint(p+'R', row, col-1);
        }
    }
    static ArrayList<String> PathInArr(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row>1){
            ans.addAll(PathInArr(p+'D', row-1, col));
        }
        if(col>1){
            ans.addAll(PathInArr(p+'R', row, col-1));
        }

        return ans;
    }

    static ArrayList<String> PathDiagonal(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row>1 && col>1){
            ans.addAll(PathDiagonal(p+'D', row-1, col-1));
        } 
        if(row>1){
            ans.addAll(PathDiagonal(p+'H', row-1, col));
        }
        if(col>1){
            ans.addAll(PathDiagonal(p+'V', row, col-1));
        }
        

        return ans;
    }
    // right down only
    static ArrayList<String> PathWithObstical(String p,boolean[][]maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(maze[row][col]==false){
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        if(row<maze.length-1){
            ans.addAll(PathWithObstical(p+'D',maze, row+1, col));
        }
        if(col<maze[0].length-1){
            ans.addAll(PathWithObstical(p+'R',maze, row, col+1));
        }

        return ans;
    }


    //we can move to all direction using backtracking
    static ArrayList<String> PathAllDirection(String p,boolean[][]maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(maze[row][col]==false){
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }

        //i am considering this block in my path
        maze[row][col]=false;
        if(row<maze.length-1){
            ans.addAll(PathAllDirection(p+'D',maze, row+1, col));
        }
        if(row>0){
            ans.addAll(PathAllDirection(p+'U',maze, row-1, col));
        }
        if(col<maze[0].length-1){
            ans.addAll(PathAllDirection(p+'R',maze, row, col+1));
        }
        if(col>0){
            ans.addAll(PathAllDirection(p+'L',maze, row, col-1));
        }
        // this line where the fn will be over
        // so before this fn gets remove also remove chnges made by that fn
        maze[row][col]=true;

        return ans;
    }

    //path with matrix print
    static ArrayList<String> PathWithMatrix(String p,boolean[][]maze,int row,int col,int[][]path,int step){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            path[row][col]=step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(maze[row][col]==false){
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }

        //i am considering this block in my path
        maze[row][col]=false;
        path[row][col]=step;
        if(row<maze.length-1){
            ans.addAll(PathWithMatrix(p+'D',maze, row+1, col,path,step+1));
        }
        if(row>0){
            ans.addAll(PathWithMatrix(p+'U',maze, row-1, col,path,step+1));
        }
        if(col<maze[0].length-1){
            ans.addAll(PathWithMatrix(p+'R',maze, row, col+1,path,step+1));
        }
        if(col>0){
            ans.addAll(PathWithMatrix(p+'L',maze, row, col-1,path,step+1));
        }
        // this line where the fn will be over
        // so before this fn gets remove also remove chnges made by that fn
        maze[row][col]=true;
        path[row][col]=0;

        return ans;
    }
    
}
