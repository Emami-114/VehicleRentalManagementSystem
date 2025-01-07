import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    public List<Vehicle> vehicles;

    public RentalSystem() {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Vehicle searchVehicle(String vehicleID) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleID == vehicleID) {
                return vehicle;
            }
        }
        return null;
    }

    public boolean rentVehicle(String vehicleID) {
        Vehicle vehicle = searchVehicle(vehicleID);
        if (vehicle != null && vehicle.isAvailable()) {
            vehicle.isAvailable = true;
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String vehicleID) {
        Vehicle vehicle = searchVehicle(vehicleID);
        if (vehicle != null && !vehicle.isAvailable()) {
            vehicle.isAvailable = true;
            return true;
        }
        return false;
    }
}
