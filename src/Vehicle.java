import java.util.UUID;

public class Vehicle {
    public String vehicleID;
    public String brand;
    public Boolean isAvailable;

    public Vehicle(String vehicleID, String brand, Boolean isAvailable) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
