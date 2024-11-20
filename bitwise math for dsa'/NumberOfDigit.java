// package bitwise math for dsa';

public class NumberOfDigit {
    public static void main(String[] args) {
        System.out.println(digi(5, 10));
    }
    static int digi(int n,int base){
        return (int)(Math.log(n)/Math.log(base)+1);
    }
}
