package TITV_learning.lastButton.controller;

import TITV_learning.lastButton.view.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener implements ActionListener {
    private view view;

    public listener(TITV_learning.lastButton.view.view view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String bt = e.getActionCommand();
        if (bt.equals("1")){
            this.view.change1();
        }
    }
}
