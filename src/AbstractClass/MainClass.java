package AbstractClass;

public class MainClass {
    public static void  main(String[] args){
        Recipe1 recipe1 = new Recipe1();
        recipe1.execute();

        Recipe2 recipe2 = new Recipe2();
        recipe2.execute();

        Animal[] animals = {new Cat(), new Dog()};
        for(Animal animal:animals){
            animal.bark();
        }
    }
}
