package PreviousWorks;

public class FanRunner {
    public static void FanRunnerMethod() {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
        fan.switchOn();
        fan.setSpeed((byte)5);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
