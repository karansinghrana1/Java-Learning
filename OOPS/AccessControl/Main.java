package AccessControl;

public class Main {
    public static void main(String[] args) {
        Access obj = new Access(10, "karan");
        System.out.println(obj.getNum());
        obj.setNum(15);
        System.out.println(obj.getNum());
    }
}
