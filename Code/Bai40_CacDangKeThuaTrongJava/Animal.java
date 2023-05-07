package TITV_learning.Code.Bai40_CacDangKeThuaTrongJava;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name+" đang ăn");
    }
}
