package PreviousWorks;

public class MotorBikeRunner {
    public  static void MotorBikeRunnerMethod(){
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);

        System.out.printf("Speed of Ducati: %d", ducati.getSpeed()).println();

        ducati.decreaseSpeed(150);
        honda.decreaseSpeed(50);

        System.out.printf("Speed of Ducati: %d", ducati.getSpeed()).println();
        System.out.printf("Speed of Honda: %d", honda.getSpeed()).println();
    }
}
