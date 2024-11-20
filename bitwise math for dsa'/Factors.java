public class Factors {
    public static void main(String[] args) {
        // fac1(40);
        fac2(40);
    }
    static void fac1(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    static void fac2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                if (n/i==i) {
                    System.out.print(i+" "); 
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
