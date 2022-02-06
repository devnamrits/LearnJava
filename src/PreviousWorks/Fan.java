package PreviousWorks;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private int speed;

    Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed){
        this.speed = (byte)speed;
    }

    public void changeSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return String.format("Make: - %s, Radius: - %f, Color: - %s, isOn: - %b, Speed: - %d", make, radius, color, isOn, speed);
    }
}
