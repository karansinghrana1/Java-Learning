// package Recursion.String;

public class RemoveA {
    public static void main(String[] args) {
        RemoveWithArgu("", "abcdaccb");
        System.out.println(RemoveWithoutArgu("abcccdaatgggaa"));
        System.out.println(RemoveWordWithoutArgu("appleapplekaran", "apple"));
        System.out.println(RemoveWordAppNotAppleWithoutArgu("appleappkaran", "apple"));
    }
     static void RemoveWithArgu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            RemoveWithArgu(p, up.substring(1));
        }else{
            RemoveWithArgu(p+ch,up.substring(1));
        }
     }

     static String RemoveWithoutArgu(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
           return RemoveWithoutArgu(up.substring(1));
        }else{
           return ch + RemoveWithoutArgu(up.substring(1));
        }
     }

     static String RemoveWordWithoutArgu(String up,String word){
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith(word)){
           return RemoveWordWithoutArgu(up.substring(word.length()),word);
        }else{
           return up.charAt(0) + RemoveWordWithoutArgu(up.substring(1),word);
        }
     }

     static String RemoveWordAppNotAppleWithoutArgu(String up,String word){
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("app") && !up.startsWith(word)){
           return RemoveWordAppNotAppleWithoutArgu(up.substring(3),word);
        }else{
           return up.charAt(0) + RemoveWordAppNotAppleWithoutArgu(up.substring(1),word);
        }
     }

     
     
}
