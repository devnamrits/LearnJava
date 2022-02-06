package PreviousWorks;

public class MotorBike {
    // state
    private int speed;

    // constructors
    MotorBike(){
        this(5);
    }

    MotorBike(int speed){
        this.speed = speed;
    }
    // behaviour
    public void  setSpeed(int speed){
        if(speed > 0){
            this.speed = speed;
        }
        else {
            this.speed = 0;
        }
    }

    public int  getSpeed(){
        return this.speed;
    }

    public void  increaseSpeed(int speed){
        setSpeed(this.speed + speed);
    }

    public  void decreaseSpeed(int speed){
        setSpeed(this.speed - speed);
    }

    public void  start() {
        System.out.println("Bike started");
    }
}
