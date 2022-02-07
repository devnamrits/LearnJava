package Interfaces;

public class MarioGame implements GameInterface{

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Duck");
    }

    @Override
    public void right() {
        System.out.println("Move Right");
    }

    @Override
    public void left() {
        System.out.println("Move left");
    }
}
