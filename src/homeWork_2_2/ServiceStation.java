package homeWork_2_2;

public class ServiceStation {

    public void serviceExamination(Service service) {

        Service.check(new Car("car", 4), null, null);
        Service.check(null, null, new Truck("truck", 6));
        Service.check(null, new Bicycle("bicycle", 2), null);
    }
}
