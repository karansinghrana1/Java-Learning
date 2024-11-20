package Generics;

public class Main {
    public static void main(String[] args) {
        // CustomArrayList list = new CustomArrayList();
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        for (int i = 0; i < 12; i++) {
            
            list.add("k"+1);
        }

        System.out.println(list);

    }
}
