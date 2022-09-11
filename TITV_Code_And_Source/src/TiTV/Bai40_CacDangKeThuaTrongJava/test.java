package TiTV.Bai40_CacDangKeThuaTrongJava;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.sua();
        dog.eat();

        BabyDog babyDog = new BabyDog();
        babyDog.sua();
        babyDog.eat();
        babyDog.khoc();

        System.out.println(babyDog.getName());

        Bird bird = new Bird("phượng hoàng");
        bird.fly();
        bird.eat();

    }
}
