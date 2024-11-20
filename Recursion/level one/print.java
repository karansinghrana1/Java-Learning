public class print {
    public static void main(String[] args) {
        // p1(5);
        // p2(5);
        p3(5);
    }
    static void p1(int n){
        if (n==0) return;
        System.out.println(n);
        p1(n-1);
    }
    static void p2(int n){
        if (n==0) return;
        
        p2(n-1);
        System.out.println(n);
    }
    static void p3(int n){
        if (n==0) return;
        System.out.println(n);
        p3(n-1);
        System.out.println(n);
    }
}
