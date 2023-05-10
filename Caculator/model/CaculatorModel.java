package TITV_learning.Caculator.model;

public class CaculatorModel {
    private String value;

    public CaculatorModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public void updateValue(String newVa){
        this.value = this.getValue()+newVa;
    }
}
