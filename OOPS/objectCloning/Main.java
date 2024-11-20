package objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kar = new Human(34,"karan");
      //  Human twin = new Human(kar);

      Human twin = (Human)kar.clone();
      System.out.println(twin.age+" "+twin.name);
    }
}
