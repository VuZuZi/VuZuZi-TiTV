package TITV_learning.Code.Bai82_buttonAndForn.controller;

import TITV_learning.Code.Bai82_buttonAndForn.view.lastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lastButtonListener implements ActionListener {
    private lastButtonView lastButtonView;

    public lastButtonListener(TITV_learning.Code.Bai82_buttonAndForn.view.lastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    public lastButtonListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSk = e.getActionCommand();
        if (nguonSk.equals("1")){
            this.lastButtonView.changeTo_1();
        }
        if (nguonSk.equals("2")){
            this.lastButtonView.changeTo_2();
        }
        if (nguonSk.equals("3")){
            this.lastButtonView.changeTo_3();
        }
        if (nguonSk.equals("4")){
            this.lastButtonView.changeTo_4();
        }
    }
}
