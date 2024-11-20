package AbstractDemo;

public class Son extends Parent {
    @Override
    void career(String name){
        System.out.println(" i am going to be" + name);
    }

    @Override
    void partner(String name,int age) {
        System.out.printf("i love " + name+" her age is" + age);
    }
    
}
