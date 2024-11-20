package AbstractDemo;

public class Daughter extends Parent{
    @Override
    void career(String name){
        System.out.println(" i am going to be" + name);
    }

    @Override
    void partner(String name,int age) {
        System.out.printf("i love " + name+" his age is" + age);
    }
}
