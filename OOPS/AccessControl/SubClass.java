package AccessControl;

public class SubClass extends Access {
    SubClass(int num,String s){
        super(num, s);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "lkj");

        System.out.println(obj.num);
    }
}
