
public class PowOfTwo {
    public static void main(String[] args) {
        System.out.println(power(9));
    }
    static boolean power(int n){
        if(n==0){
            return false;
        }
        return (n&(n-1)) == 0;
    }
    
}
