
public class Car extends Vehicle {
    private Integer inherits;
    private FuelTypeEnum fuelType;

    public Car(String vehicleID, String brand, Boolean isAvailable, Integer inherits, FuelTypeEnum fuelType) {
        super(vehicleID, brand, isAvailable);
        this.inherits = inherits;
        this.fuelType = fuelType;
    }

    public enum FuelTypeEnum {
        PETROL,
        DIESEL,
        ELECTRIC
    }
}
