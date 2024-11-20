package Human;

import AccessControl.Access;

 

public class Subclass extends Access {
    Subclass(int num,String s){
        super(num, s);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(11, "lkj");

        System.out.println(obj.num);
    }
}
