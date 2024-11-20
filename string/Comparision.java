public class Comparision {

    public static void main(String[] args) {
        String a="karan";
        String b="karan";

        System.out.println(a==b);
        a="rana";
        System.out.println(a);
        String name1= new String("karan");
        String name2= new String("karan");

        System.out.println(a==b);
        System.out.println(name1.equals(name2));
    }

    
}
