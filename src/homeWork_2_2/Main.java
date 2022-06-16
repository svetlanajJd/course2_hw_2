package homeWork_2_2;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Bicycle.check(bicycle);
        Bicycle.check(bicycle2);
        Truck.check(truck);
        Truck.check(truck2);
        Car.check(car);
        Car.check(car2);
    }
}
