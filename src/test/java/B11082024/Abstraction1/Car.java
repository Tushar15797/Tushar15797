package B11082024.Abstraction1;

 class Car extends Engine {


     @Override
     void partGearbox() {
         System.out.println("Part of Gearbox");
     }

     @Override
     void opencar() {
         System.out.println("Part of Gearbox");
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
         System.out.println("Speed of the Car 50km/hr");
     }
 }
