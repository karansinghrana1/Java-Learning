import java.util.*;
import java.text.DecimalFormat;

public class Stringbuffer {
    public static void main(String[] args){
        //constructor 1
        StringBuffer sb = new StringBuffer();
        //constructor 2
        StringBuffer sb2 = new StringBuffer("karan singh rana");
        //constructor 3
        StringBuffer sb3 = new StringBuffer(30); // capacity

        // sb.append("wemakedevs");
        // sb.append(" i am great");
        // sb.insert(2," hahahh ");
        // sb.replace(3,7,"kkkkk");
        // sb.delete(3,7);
        // sb.reverse();
        // String str = sb.toString();
        // System.out.println(str);
        // System.out.println(sb.capacity());

        RandomString rs= new RandomString();

        int n =13;
        String name=rs.generate(n);
        System.out.println(name);

        // removing white spaces

        // String sen = "hi    my  name      is";
        // System.out.println(sen);
        // System.out.println(sen.replaceAll("\\s",""));

        //split

        String sen = "hi my name is";
        System.out.println(sen);
        String[] arr = sen.split(" ");
        System.out.println(Arrays.toString(arr));

        //rounding off
        DecimalFormat df = new DecimalFormat("0.00000000");
        System.out.println(df.format(7.2));
        
    }
}
