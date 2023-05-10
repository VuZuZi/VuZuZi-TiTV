package TITV_learning.Code.bai83_editColor.controller;

import TITV_learning.Code.bai83_editColor.view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {
    private MyColorView view;

    public MyColorListener(MyColorView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Red text")){
            this.view.changeColor(Color.red);
        }
        if (src.equals("Yellow text")){
            this.view.changeColor(Color.yellow);
        }
        if (src.equals("Blue text")){
            this.view.changeColor(Color.blue);
        }
        if (src.equals("Red Background")){
            this.view.changeColorB(Color.red);
        }
        if (src.equals("Yellow Background")){
            this.view.changeColorB(Color.yellow);
        }
        if (src.equals("Blue Background")){
            this.view.changeColorB(Color.blue);
        }

    }
}
