package A1_classes_and_objects;

public class Car {

    private String brand;
    private String model;
    private int year;
    private double speed;
    private double distance;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0.0;
        this.distance = 0.0;
    }

    public void accelerate(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Acceleration amount cannot be negative.");
        }

        speed += amount;
    }

    public void brake(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Braking amount cannot be negative.");
        }
        speed -= amount;

        if (speed < 0) {
            speed = 0;
        }
    }


    public void drive(double time) {
        if (time < 0) {
            throw new IllegalArgumentException("Time cannot be negative.");
        }

        distance += speed * time;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }
}