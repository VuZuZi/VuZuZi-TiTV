package TITV_learning.Code.bai84MayTinh.model;

public class MiniCalculatorModel {
    private double firstValue,secondValue,answer;

    public MiniCalculatorModel(double firstValue, double secondValue, double answer) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.answer = answer;
    }

    public MiniCalculatorModel() {
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void sum(){
        this.answer=this.firstValue+this.secondValue;
//        System.out.println(answer);
    }
    public void minus(){
        this.answer=firstValue-secondValue;
    }
    public void mul(){
        this.answer=this.firstValue*this.secondValue;
//        System.out.println(firstValue);
//        System.out.println(secondValue);
//        System.out.println(firstValue*secondValue);
//        System.out.println("mul"+answer);

    }
    public void div(){
        this.answer=firstValue/secondValue;
//        System.out.println("div"+answer);

    }
    public void pow(){
        this.answer= Math.pow(firstValue,secondValue) ;
//        System.out.println("pow"+answer);

    }
    public void mod(){
        this.answer = firstValue%secondValue;
//        System.out.println("mod"+answer);

    }
}
