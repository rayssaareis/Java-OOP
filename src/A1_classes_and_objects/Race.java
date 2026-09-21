/*
 * A1_Classes_and_Objects
 *
 * In this exercise I practiced the basics of classes and objects
 * by creating a simple car simulation.
 *
 * Each Car object has its own data, such as brand, model, year,
 * speed and distance, and methods that change its state.
 *
 * The main idea here was to understand that an object has its
 * own state and behavior, and that different objects from the
 * same class can behave independently.
 */

package A1_classes_and_objects;

public class Race {
    public static void main(String[] args) {
        // Create two car objects
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);

        car1.accelerate(60);
        car2.accelerate(70);

        // Both of them drive for 2 hours
        car1.drive(2);
        car2.drive(2);

        // Brake for 10 and 20 miles respectively
        car1.brake(10);
        car2.brake(20);

        // Drive for another 1 hour
        car1.drive(1);
        car2.drive(1);

        // Brake for 10 and 40 miles respectively
        car1.brake(10);
        car2.brake(40);

        // Drive for more 1 hour
        car1.drive(1);
        car2.drive(1);

        System.out.println(car1.getBrand() + " " + car1.getModel() + " traveled: " + car1.getDistance() + " miles.");
        System.out.println(car2.getBrand() + " " + car2.getModel() + " traveled: " + car2.getDistance() + " miles.");

        // Determine the winner based on distance traveled
        String winner;
        if (car1.getDistance() > car2.getDistance()) {
            winner = car1.getBrand() + " " + car1.getModel();
        } else if (car2.getDistance() > car1.getDistance()) {
            winner = car2.getBrand() + " " + car2.getModel();
        } else {
            winner = "It's a tie!";
        }

        System.out.println("The winner is: " + winner);
    }
}
