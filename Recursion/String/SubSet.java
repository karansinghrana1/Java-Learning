// package Recursion.String;
import java.util.*;
public class SubSet {
    public static void main(String[] args) {
        // subset("", "abcd");
        // System.out.println(subsetInArrayList("", "abcd"));
        // subsetAsci(" ", "abc");
        // System.out.println(subsetInArrayListAscii("", "abcd"));
        int[] arr={1,2,2};
        System.out.println(UsingIterationDuplicate(arr));
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }
    static ArrayList<String> subsetInArrayList(String p,String up){

        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list; 
        }
        char ch=up.charAt(0);
        ArrayList<String> left =subsetInArrayList(p+ch, up.substring(1));
        ArrayList<String> right=subsetInArrayList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsetAsci(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subsetAsci(p+ch, up.substring(1));
        subsetAsci(p, up.substring(1));
        subsetAsci(p+(ch+0), up.substring(1));
        
    }
    static ArrayList<String> subsetInArrayListAscii(String p,String up){

        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list; 
        }
        char ch=up.charAt(0);
        ArrayList<String> first =subsetInArrayListAscii(p+ch, up.substring(1));
        ArrayList<String> second=subsetInArrayListAscii(p, up.substring(1));
        ArrayList<String> third=subsetInArrayListAscii(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    static List<List<Integer>> UsingIteration(int[]arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }
        return outer;
    }
    static List<List<Integer>> UsingIterationDuplicate(int[]arr){
        Arrays.sort(arr);
        int start =0;
        int end=0;
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int j=0;j<arr.length;j++){
            start=0;
            if(j>0 && arr[j]==arr[j-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int size = outer.size();
            for (int i = start; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(j);
                outer.add(internal);
            }

        }
        return outer;
    }
}
