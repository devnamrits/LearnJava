package AbstractClass;

public class Recipe1 extends AbstractRecipe{
    @Override
    public void getReady() {
        System.out.println("Collect Raw materials");
    }

    @Override
    public void doTheDish() {
        System.out.println("Prepare the Dish");
    }

    @Override
    public void cleanUp() {
        System.out.println("Clean utensils");
    }
}
