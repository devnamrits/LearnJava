package PreviousWorks;

public class TwoNumberCalculator {
    private  int num1;
    private  int num2;

    TwoNumberCalculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public  int add(){
        return  this.num1 + this.num2;
    }

    public  int subtract(){
        return  this.num1 - this.num2;
    }

    public int multiply(){
        return  this.num1 * this.num2;
    }

    public int divide(){
        return  this.num1 / this.num2;
    }
}
