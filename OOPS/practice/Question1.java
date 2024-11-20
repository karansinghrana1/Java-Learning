package practice;
// /* Find the Maximum Ascii valued character in a String
//  * Arijit = t
//  * priyanka = y
//  * Aa = a
//  */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        char ans =s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(ans<s.charAt(i)){
                ans=s.charAt(i);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
