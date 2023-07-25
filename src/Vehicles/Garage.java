package Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
    private List<Vehicle> garage;

    public Garage(){
        garage = new ArrayList<>();
    }

    public void clearGarage(){
        this.garage.clear();
        System.out.printf("Garage emptied");
    }

    public void contentsGarage(){
        System.out.println(garage.toString()+"\n");
    }

    public void add(Vehicle vehicle){
        garage.add(vehicle);
        System.out.println("Vehicle " + vehicle.getMake() + " " +  vehicle.getModel() + " with id " + vehicle.getID() + " has been added to the garage.");
    }

    public boolean removeOne(String type){
        Vehicle Remove = garage.stream().filter( vehicle -> vehicle.getType() == (type)).findAny().orElse(null);
        if (Remove != null){
            System.out.println("Vehicle " + Remove.getMake() + " " + Remove.getModel()+" with ID "+ Remove.getType() + " has been removed.");
            return garage.remove(Remove);
        }
        else {
            System.out.println("No vehicles exist with given type");
        }
        return false;
    }

    public int removeType(String type){
        if (type.equals("Car")){
            this.garage = this.garage.stream().filter(vehicle ->!(vehicle instanceof Car)).collect(Collectors.toList());
        } else if (type.equals("Truck")){
            this.garage = this.garage.stream().filter(vehicle -> !(vehicle instanceof Truck)).collect(Collectors.toList());
        } else if (type.equals("Motorbike")){
            this.garage = this.garage.stream().filter(vehicle -> !(vehicle instanceof Motorbike)).collect(Collectors.toList());
        };
        return 0;
    }

    public int bill(){
        int initBill = 0;
        for (Vehicle vehicle: garage){
            if (vehicle instanceof Car){
                initBill += vehicle.getEnginePower() * 2;
            } else if (vehicle instanceof Motorbike){
                initBill += vehicle.getEnginePower() * 2;
            } else if (vehicle instanceof Truck){
                initBill += vehicle.getEnginePower() * 4;
            }
        }
        System.out.println("The total bill for repairs is $" + initBill);
        return initBill;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle vehicle: garage){
            sb.append("Vehicle: ");
        }
        return sb.toString();
    }
}
