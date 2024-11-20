package Polymorphism;
public class Circle extends Shapes{
    //this will call when obj of circle is created
        //hence it is overriding the parent metod
    @Override//to check override or not called annotattion
    void area(){
        System.out.println("i am in circle");
    }
} 