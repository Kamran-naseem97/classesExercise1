package Vehicles;

public class Car extends Vehicle {
    private int bootSize;
    private int noOfDoors;
    private String type;

    public Car(){
        super(1,4, 5, 380, false, "Toyota", "Supra", "Petrol", "White", "Car");
        this.type = "Car";
    }

    public Car(int ID, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, int bootSize, int noOfDoors, String type) {
        super(ID, noOfWheels, noOfSeats, enginePower, electric, make, model, fuelType, colour, type);
        this.bootSize = bootSize;
        this.noOfDoors = noOfDoors;
        this.type = "Car";
    }

    public void openDoors(){
        System.out.println("Car doors are open");
    }

    public int getBootSize() {
        return bootSize;
    }

    public void setBootSize(int bootSize) {
        this.bootSize = bootSize;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void startup() {
        System.out.println("Vroom");
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "bootSize=" + bootSize +
                ", noOfDoors=" + noOfDoors +
                ", type='" + type + '\'' +
                '}';
    }
}
