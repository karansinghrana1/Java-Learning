package Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("PE  acc");
        
    }

    @Override
    public void start() {
        System.out.println("PE start");
        
    }

    @Override
    public void stop() {
        System.out.println("PE stop");
        
    }
    
}
