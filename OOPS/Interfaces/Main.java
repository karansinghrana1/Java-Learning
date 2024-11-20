package Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.start();
        // car.acc();
        // car.brake();
        // car.stop();
        ElectricEngine ee= new ElectricEngine();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine(ee);
        car.start();
    }
}
