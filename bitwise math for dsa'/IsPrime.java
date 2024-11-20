public class IsPrime {
    public static void main(String[] args) {
        
    }
    static boolean prime(int n){
        int c=0;
        if(n<=1){
            return false;
        }
        while(c*c<=n){
            if(n%2==0){
                return false;
            }
            c++;
        }
        return true;

    }
}
