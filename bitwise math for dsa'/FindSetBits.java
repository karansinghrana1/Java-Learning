
public class FindSetBits {
    public static void main(String[] args) {
        System.out.println(find(10));
    }
    static int find(int n){
        int c=0;
        while (n>0) {
            c++;
            n=n&(n-1);
        }
        return c;
    }
}
