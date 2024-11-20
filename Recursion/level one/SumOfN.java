// package level one;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sum(9));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return n;
        }

        return n+sum(n-1);

    }
}
    

