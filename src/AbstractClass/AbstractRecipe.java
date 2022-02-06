package AbstractClass;

public abstract class AbstractRecipe {

    //Abstract class can have member variables and full-fledged concrete methods with definitions
    public void execute(){
        System.out.println("Executing Recipe");
        getReady();
        doTheDish();
        cleanUp();
    }

    //abstract Methods
    abstract public void getReady();
    abstract public void doTheDish();
    abstract public void cleanUp();
}
