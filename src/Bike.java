public class Bike extends Vehicle {
    private String color;
    private int gears;

    public Bike(String name, double maxSpeed, int gears, String color) {
        super(name, maxSpeed);
        this.gears = gears;
        this.color = color;
    }

    @Override
    public void go() {
        System.out.println("sssssssss");
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
