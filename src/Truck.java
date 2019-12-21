public class Truck extends Vehicle {

    private double heightInMeters;


    public Truck(String name, double maxSpeed, double height) {
        super(name, maxSpeed);
        this.heightInMeters = height;
    }

    @Override
    public void go() {
        System.out.println("Wrrrrrrum");
    }

    public double getHeight() {
        return heightInMeters;
    }

    public void setHeight(double height) {
        this.heightInMeters = height;
    }

    public void entrucking() {
        System.out.println("Loaded successfully!");
    }

    public void entrucking(String load) {
        System.out.println(load + " has been loaded successfully");
    }

}
