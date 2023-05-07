package TITV_learning.Code.Bai35QuanLySach;

import java.util.Objects;

public class Book {
    private String nameBook;
    private double price;
    private int dateSX;
    private TacGia tacGia;

    public Book(String name, double price, int dateSX, TacGia tacGia) {
        this.nameBook = name;
        this.price = price;
        this.dateSX = dateSX;
        this.tacGia = tacGia;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String name) {
        this.nameBook = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDateSX() {
        return dateSX;
    }

    public void setDateSX(int dateSX) {
        this.dateSX = dateSX;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void printNameBook(){
        System.out.println(this.getNameBook());
    }

    public boolean checkForYear(Book otherBook){
//        if (this.getDateSX() == otherBook.getDateSX()){
//            return true;
//        }
//        else{ return false;}
        return this.dateSX == otherBook.dateSX;
    }
    public double priceSell(double percentage){
        return this.price*(1-percentage/100);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateSX == book.dateSX;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateSX);
    }
}
