import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // int a=30,b=67;
        // BigInteger A = BigInteger.valueOf(33);
        // BigInteger B = BigInteger.valueOf(69);
        // BigInteger C =new BigInteger("87869446461464644646882");//this will also convert to number
        // BigInteger X =new BigInteger("8786944646146464444646882");


        // //constant
        //  BigInteger D = BigInteger.ZERO;

        //  //addition
        //  BigInteger s = C.add(X);
        //  System.out.println(s);

        //  //multyply
        //  BigInteger m = C.multiply(X);
        //  System.out.println(m);

        //  //sub
        //  BigInteger sub = C.subtract(X);
        //  System.out.println(sub);


        //  //divide
        //  BigInteger d = C.divide(X);
        //  System.out.println(d);
         

        //  //remainder
        //  System.out.println( C.remainder(X));

        //  //compare
        //  if(C.compareTo(X)<0){
        //     System.out.println("yes");
        //  }

        //  System.out.println(fac(98555));
        error();

        BigDecimal a=BigDecimal.valueOf(0.03);
        BigDecimal b=BigDecimal.valueOf(0.04);
        BigDecimal s = a.subtract(b);
        System.out.println(s);



 

    }

    public static void error(){
        double a=0.03;
        double b = 0.04;
        double s = b-a;
        System.out.println(s);
    }

    public static BigInteger fac(int n){
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
