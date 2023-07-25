package Vehicles;

abstract class Vehicle implements Comparable<Vehicle> {
    private String name;
    private int ID;
    private int noOfWheels;
    private int noOfSeats;
    private int enginePower;
    private boolean electric;
    private String make;
    private String model;
    private String fuelType;
    private String colour;
    private String type;

    public abstract void startup();
    public Vehicle(){
        super();
    }
    public Vehicle(int ID, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, String type){
        this.ID = ID;
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
        this.enginePower = enginePower;
        this.electric = electric;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.colour = colour;
        this.type = type;
    }
    public void go(){
        System.out.println("Vroom Vroom");
    }
    public void stop(){
        System.out.println("Skrrt Skrrt");
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Vehicle o) {
        return o.ID - this.ID;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", noOfWheels=" + noOfWheels +
                ", noOfSeats=" + noOfSeats +
                ", enginePower=" + enginePower +
                ", electric=" + electric +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\''
                ;
    }
}
