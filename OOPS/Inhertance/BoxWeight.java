package Inhertance;

public class BoxWeight extends Base {
    double weight;
    BoxWeight(){
        this.weight= -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//cal parent class constructor 
        //used to intialize values present in parengt class
        System.out.println("child class cont");
        this.weight = weight;
    }
    
}
