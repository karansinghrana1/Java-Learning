package Human;

public class Main {
    public static void main(String[] args) {
        Human karan = new Human(20, "karan", 22000, false);
        Human pradeep = new Human(60, "pradeep", 310000, true);

        // System.out.println(karan.name);
        // System.out.println(pradeep.name);
        System.out.println(karan.pop);
        System.out.println(pradeep.pop);
    }
}