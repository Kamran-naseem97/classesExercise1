package Vehicles;

public class Motorbike extends Vehicle {
    private boolean hasSideCar;
    private String type;

    public Motorbike(){
        super(2,2, 1, 160, false, "Yamaha", "R1", "Petrol", "Black", "<Motorbike");
        this.type = "Motorbike";
    }

    public Motorbike(int ID, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, boolean hasSideCar, String type) {
        super(ID, noOfWheels, noOfSeats, enginePower, electric, make, model, fuelType, colour, type);
        this.hasSideCar = hasSideCar;
        this.type = "Motorbike";
    }

    public void doWheelie(){
        System.out.println("Motorbike doing a wheelie");
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void startup() {
        System.out.println("Small Vroom");
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "ID= " + getID()+
                "hasSideCar=" + hasSideCar +
                ", type='" + type + '\'' +
                '}';
    }
}
