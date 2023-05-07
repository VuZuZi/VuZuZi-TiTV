package TITV_learning.Code.Bai66_Generic;

public class TestBox2 {
    public static void main(String[] args) {
        Box2 box2 = new Box2<Integer>(15);
        System.out.println("giá trị của box<>: "+box2.getValue());

        Box2 box21 = new Box2<String>("Hello World");
        System.out.println("giá trịc của box1<>: "+box21.getValue());

        Box2 box22 = new Box2<Double>(15.5);
        System.out.println("giá trị của Box22: "+box22.getValue());
    }
}
