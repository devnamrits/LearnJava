package AbstractClass;

//When a call extends an abstract class then either it has to be abstract too or write definition for all the abstract methods.
public class Recipe2 extends AbstractRecipe{
    @Override
    public void getReady() {
        System.out.println("Collect all ingredients");
    }

    @Override
    public void doTheDish() {
        System.out.println("Dish is getting prepared");
    }

    @Override
    public void cleanUp() {
        System.out.println("Clean up the utensiils");
    }
}
