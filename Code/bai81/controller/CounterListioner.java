package TITV_learning.Code.bai81.controller;

import TITV_learning.Code.bai81.view.counterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListioner implements ActionListener {
    private counterView ctv;
    public CounterListioner(counterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Bạn đã nhấn Str
//        ");

        String src = e.getActionCommand();
//        System.out.println(src);

        if (src.equals("Up")){
            this.ctv.increment();
        }else {
            this.ctv.decrement();
        }


    }
}
