package Vehicles;

import java.util.UUID;

public class Truck extends Vehicle{
    private int noOfDoors;
    private int deliverySize;
    private boolean trailerAttached;
    private String type;

    public Truck(){
        super(String.valueOf(UUID.randomUUID()),2, 2, 500, false, "Mercedes", "TruckityTruck", "Diesel", "Red", "Truck");
    }

    public Truck(String ID, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, int noOfDoors, int deliverySize, boolean trailerAttached, String type) {
        super(ID, noOfWheels, noOfSeats, enginePower, electric, make, model, fuelType, colour, type);
        this.noOfDoors = noOfDoors;
        this.deliverySize = deliverySize;
        this.trailerAttached = trailerAttached;
        this.type = "Truck";
    }

    public void toggleTrailer(){
        System.out.println("Truck trailer attached");
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getDeliverySize() {
        return deliverySize;
    }

    public void setDeliverySize(int deliverySize) {
        this.deliverySize = deliverySize;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "noOfDoors=" + noOfDoors +
                ", deliverySize=" + deliverySize +
                ", trailerAttached=" + trailerAttached +
                ", type='" + type + '\'' +
                '}';
    }
}
