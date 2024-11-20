package practice;
// /* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
//  * 
//  * Input : 123
//  * Output : 321
//  * 
//  * Input : 234
//  * Output : Can not reverse
//  */
import java.util.Scanner;

public class OddReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();sc.nextLine();
        int rev=0;

        if(num%2!=0){
            while(num>0){
                rev=rev*10+(num%10);
                num/=10;
            }
            System.out.println(rev);
        }
        else{
            System.out.println("Can not reverse");
        }
        sc.close();
    }
}
