package Interfaces;

public class Project {
    public static void main(String[] args){
        /*
            Interfaces help in outsourcing as well. Interface is a contract between two classes which want to communicate
            with each other.
            Through interface, we can develop that part of code that is not developed yet. We can provide a dummy
            implementation while feature is not developed and once it gets developed we'll replace it back.
            It is illustrated in below example. As real algorithm is not developed yet we have replaced it with an
            dummy implementation of a complex algorithm.
         */
        ComplexAlgorithm dummyAlgorithm = new DummyAlgorithm();
        System.out.println(dummyAlgorithm.ComplexAlgorithm(2,10));

        /*
            Now the real algorithm is developed we will be now replacing the DummyAlgorithm part with the RealAlgorithm.
         */
        ComplexAlgorithm realAlgorithm = new RealAlgorithm();
        System.out.println(realAlgorithm.ComplexAlgorithm(2,10));

    }
}
