package Interfaces;

/*
    * Interface can extend another interface. e.g. Interface2 extends Interface1
    * When a class extends Interface2 then it had to implement methods for both Interface1 and Interface2
    * In case you want to implement methods of Interface1 only then one can create an abstract class and then combination
      of abstract class and concrete class provides the implementation of all the methods.
    * Concrete methods in interfaces can be implemented using default keyword.
    * In any interface you can't create variable you can create constant.
 */

public interface ComplexAlgorithm {
    public int ComplexAlgorithm(int num1, int num2);
}
