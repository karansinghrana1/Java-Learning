package objectCloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr= new int[]{1,2,3,4};
    }

    public Human(Human h){
        this.age=h.age;
        this.name=h.name;
    }

    // public Object clone() throws CloneNotSupportedException{
    // this is shallow copy
    //     return super.clone();
    // }
    public Object clone() throws CloneNotSupportedException{
        
        Human twin = (Human)super.clone(); // actually shallow copy
        // for deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }

        return twin;

    }
}
