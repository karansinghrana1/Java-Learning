// package level one;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(9));
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        if(n==1 || n==2){
            return n;
        }

        return n*fact(n-1);

    }
}
