import products.Product;
import vehicles.*;

public class Runner {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 20, new Product(350, 5, "BMX"));
        System.out.println(bicycle.getWheelCount());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getTitle());

        Car car = new Car(200, 120, new Product(10000, 3, "2015 Dacia Duster"), new Engine(100, 150));
        car.startEngine();
        Engine betterEngine = new Engine(300, 400);
        car.setEngine(betterEngine);
        System.out.println(car.getHp());

        Speedboat speedboat = new Speedboat(
            200,
            120,
            new Product(10000, 3, " 2016 Speedboat"),"long", new Motor(150,300));
        System.out.println(speedboat.getHullType());
        Motor bettermotor = new Motor(150,300);
        speedboat.setMotor(bettermotor);
        System.out.println(speedboat.getFuel());

    }





}
