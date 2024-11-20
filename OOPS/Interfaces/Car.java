package Interfaces;

public class Car implements Engine,Media,Brake {

    @Override
    public void brake() {
        System.out.println("i breake like normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like normal car");
    }

    @Override
    public void acc() {
        System.out.println("i acc like normal car");
    }
    
}
