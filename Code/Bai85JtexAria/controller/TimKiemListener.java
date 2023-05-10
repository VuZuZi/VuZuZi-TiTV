package TITV_learning.Code.Bai85JtexAria.controller;

import TITV_learning.Code.Bai85JtexAria.view.TimKiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemListener implements ActionListener {
    private TimKiemView timKiemView;

    public TimKiemListener(TimKiemView timKiemView) {
        this.timKiemView = timKiemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        this.timKiemView.timKiem();

    }
}
