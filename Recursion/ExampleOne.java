// package Recursion;

public class ExampleOne {
    public static void main(String[] args) {
        print(0);
    }
    static void print(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
