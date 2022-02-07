package Interfaces;

public class GameRunner {
    public static void main(String[] args){
        // We can directly instantiate object of a class but using an interface we can instantiate objects of different
        // under the name of interface which that class implements. All the below four instantiation are right.
        // Same game object can be created for both ChessGame and MarioGame under GameInterface.
        // MarioGame game = new MarioGame();
        // ChessGame game = new ChessGame();
        // GameInterface game = new MarioGame();
        GameInterface game = new ChessGame();
        game.down();
        game.up();
        game.right();
        game.left();
    }
}
