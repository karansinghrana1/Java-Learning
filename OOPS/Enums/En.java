package Enums;

public class En {
    enum week{
        mon,tues,wed,thur,fri,sat,sun;
        // enum constants
        // by default public static final
        // its finals we cant not creat child enum
    }


    public static void main(String[] args) {
        week w;
        w= week.mon;

        for (week day : week.values()) {
            System.out.println(day);
        }

    }



    
} 
