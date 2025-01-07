import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Car car1 = new Car("1", "Toyota", true, 5, Car.FuelTypeEnum.PETROL);
        Car car2 = new Car("2", "Tesla", true, 4, Car.FuelTypeEnum.ELECTRIC);
        Motorbike bike1 = new Motorbike("3", "Yamaha", true, 1000, true);
        Motorbike bike2 = new Motorbike("4", "Honda", true, 500, false);

        rentalSystem.addVehicle(car1);
        rentalSystem.addVehicle(car2);
        rentalSystem.addVehicle(bike1);
        rentalSystem.addVehicle(bike2);

        System.out.println("All vehicles:\n");
        for (Vehicle vehicle : rentalSystem.getVehicles()) {
            System.out.println("ID: " + vehicle.vehicleID + "  Brand: " + vehicle.brand);
        }
        String searchID = "1";

        System.out.println("\nRenting vehicle " + searchID + ":");
        if (rentalSystem.rentVehicle(searchID)) {
            System.out.println("Vehicle rented successfully.");
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
        System.out.println("\nReturning vehicle " + searchID + ":");
        if (rentalSystem.returnVehicle(searchID)) {
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("Vehicle was not rented.");
        }

        System.out.println("\nUpdated vehicle details:");
        System.out.println(rentalSystem.searchVehicle(searchID));
    }
}