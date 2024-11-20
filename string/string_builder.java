public class string_builder {
    public static void main(String[] args) {
        StringBuilder b=new StringBuilder();
        for(int var1 = 0; var1 < 26; ++var1) {
            char ch=(char)(97 + var1);
            b.append(ch);
            
         }
         System.out.print(b.toString());
    }
}
