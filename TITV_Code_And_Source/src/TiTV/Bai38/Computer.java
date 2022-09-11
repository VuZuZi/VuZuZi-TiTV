package TiTV.Bai38;

import TiTV.Bai37.Date;

public class Computer {
    private HangSanXuat hangSanXuat;
    private Date date;
    private double price;
    private double timeBH;

    public Computer(HangSanXuat hangSanXuat, Date date, double price, double timeBH) {
        this.hangSanXuat = hangSanXuat;
        this.date = date;
        this.price = price;
        this.timeBH = timeBH;
    }

    public Computer(HangSanXuat mq, TiTV.Bai38.Date date, int price, int timeBH) {
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTimeBH() {
        return timeBH;
    }

    public void setTimeBH(double timeBH) {
        this.timeBH = timeBH;
    }

    public boolean checkPriceLess(Computer computer){
        return this.getPrice()<=computer.getPrice();
    }

    public Country findCountry(){
        return this.hangSanXuat.getCountry();
    }
}
