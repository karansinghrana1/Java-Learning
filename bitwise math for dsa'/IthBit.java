// package bitwise math for dsa';

public class IthBit {
    public static void main(String[] args) {
        System.out.println(bit(1000100,3));
    }
    static int bit(int n,int i){
        return n&(1<<(n-1));
    }
}
