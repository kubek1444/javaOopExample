public class Car extends Vehicle {
    private String engine;
    private int horsepower;

    public Car(String name, double maxSpeed, String engine, int horsepower) {
        super(name, maxSpeed);
        this.engine = engine;
        this.horsepower = horsepower;
    }

    @Override
    public void go() {
        System.out.println("Ratatatata");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


}
