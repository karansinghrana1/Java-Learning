package Interfaces;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Cd player start");
        
    }

    @Override
    public void stop() {
        System.out.println("Cd player stop");
        
    }
    
}
