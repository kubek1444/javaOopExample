public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike("Bike v1", 13.0, 5, "black");
        bike.go();

        Vehicle car = new Car("Car v1", 220.0, "Engine v1", 96);

        System.out.println(car.getMaxSpeed());

        Truck truck = new Truck("Truck v1", 67.0, 2.5);

        truck.entrucking();
        truck.entrucking("food");

    }
}
