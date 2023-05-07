package TITV_learning.Code.bai81.model;

public class CounterModel {
    private int value;

    public CounterModel() {
        this.value=0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incresment(){
        this.value++;
    }

    public void decrement(){
        this.value--;
    }

    public void resetStart(){
        this.value=0;
    }
}
