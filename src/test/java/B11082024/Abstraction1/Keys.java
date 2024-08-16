package B11082024.Abstraction1;

import B04082024.IsA.Car;

public class Keys extends Gearbox{


    @Override
    void opencar() {
        System.out.println("Open the Car");
    }

    @Override
    void start() {
        System.out.println("Start the Car");
    }

    @Override
    void stop() {
        System.out.println("Stop the Car");
    }

    @Override
    void speed() {
        System.out.println("Speed of the Car");
    }

    @Override
    void partGearbox() {
        System.out.println("Gear Box Part");
    }
}
