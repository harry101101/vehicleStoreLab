import products.Product;
import vehicles.*;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Kayak;
import vehicles.water.Speedboat;


import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...
        Speedboat speedboat1 = new Speedboat(300, 60,new
                Product("yellow speed boat", 5000, 52),
                "v-shape", new Motor(120, 200));
        vehicles.add(speedboat1);
        speedboat1.startEngine();
        System.out.println(speedboat1.getFuel());
        System.out.println(speedboat1.getHp());
        System.out.println(speedboat1.getHullType());


        Kayak kayak1 = new Kayak(20, 15, new Product
                ("blue kayak", 100, 762), "u-shape");
        vehicles.add(kayak1);
        System.out.println(kayak1.getHullType());


    }
}
