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

        ServiceStation.serviceExamination(car);
        ServiceStation.serviceExamination(car2);
        ServiceStation.serviceExamination(bicycle);
        ServiceStation.serviceExamination(bicycle2);
        ServiceStation.serviceExamination(truck);
        ServiceStation.serviceExamination(truck2);
    }
}
