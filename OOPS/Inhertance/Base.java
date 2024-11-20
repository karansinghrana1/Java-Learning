package Inhertance;
public class Base {
    double l,h,w;
    Base(){
        //super();//calling object class see by ctrl click
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Base(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Base(double l,double h, double w){
        System.out.println("base class cont");
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Base(Base old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public void Information(){
        System.out.println("Running the bse class");
    }
}
