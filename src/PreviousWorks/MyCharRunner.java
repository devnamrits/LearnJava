package PreviousWorks;

public class MyCharRunner {
    public  static  void  MyCharRunnerMethod(){
        MyChar char1 = new MyChar('A');
        MyChar char2 = new MyChar('B');
        MyChar char3 = new MyChar('1');

        System.out.println(char1.isVowel());
        System.out.println(char2.isConsonant());
        System.out.println(char3.isDigit());

        MyChar.printLowerAlphabet();
    }
}
