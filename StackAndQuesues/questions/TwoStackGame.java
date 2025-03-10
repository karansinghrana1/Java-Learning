package StackAndQuesues.questions;
import java.util.*;

public class TwoStackGame {
    static int twoStack(int max,int[] a,int[] b){
        return twoStacks(max,a,b,0,0)-1;
    }

    private static int twoStacks(int max, int[] a, int[] b, int sum, int count) {
        if(sum>max){
            return count;
        }
        if(a.length==0||b.length==0){
            return count;
        }
        int ans1=twoStacks(max, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2=twoStacks(max, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);

        return Math.max(ans1, ans2);

    }
}
