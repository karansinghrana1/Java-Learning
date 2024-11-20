package Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void acc() {
        System.out.println("EE ACC");
        
    }

    @Override
    public void start() {
        System.out.println("EE start");
    }

    @Override
    public void stop() {
        System.out.println("EE stop");
    }

}
