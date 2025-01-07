
public class Motorbike extends Vehicle {
    private Integer engineCapacity;
    private Boolean hasHelmetIncluded;

    public Motorbike(String vehicleID, String brand, Boolean isAvailable, Integer engineCapacity, Boolean hasHelmetIncluded) {
        super(vehicleID, brand, isAvailable);
        this.engineCapacity = engineCapacity;
        this.hasHelmetIncluded = hasHelmetIncluded;
    }
}
