package chapter08;

public class BasicOOP {

    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.brand = "Hyndai";
        myCar1.speed = 120;

        Car myCar2 = new Car();
        myCar2.brand = "KIA";
        myCar2.speed = 100;

        Car myCar3 = new Car();
        myCar3.brand = "Jeep";
        myCar3.speed = 140;

        myCar1.drive();
        myCar2.drive();
        myCar3.drive();
    }
}
