package TITV_learning.Code.bai83_editColor.model;

import java.awt.*;

public class MyColorModel {
    private Color foreground; // màu chữ
    private Color background; // màu nền
    private boolean opaque; // màu viền

    public MyColorModel() {
        this.foreground = Color.red;
        this.background = Color.yellow;
        this.opaque = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }



}
