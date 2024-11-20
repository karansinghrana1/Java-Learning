// package Recursion;

public class fib {
    public static void main(String[] args) {
        System.out.println(FibNo(6));
    }
    static int FibNo(int n){
        if(n==0 || n==1){
            return n;
        }

        return FibNo(n-1)+FibNo(n-2);
    }
}
