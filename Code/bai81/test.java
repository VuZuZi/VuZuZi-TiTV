package TITV_learning.Code.bai81;

import TITV_learning.Code.bai81.model.CounterModel;
import TITV_learning.Code.bai81.view.counterView;

public class test {
    public static void main(String[] args) {
        CounterModel count = new CounterModel();
        System.out.println(count.getValue());
        count.incresment();
        count.incresment();
        count.incresment();
        count.incresment();

        System.out.println(count.getValue());
        count.decrement();
        System.out.println(count.getValue());

        counterView counterView = new counterView();
        counterView.init();
    }
}
