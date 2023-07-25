package Vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        Garage garage = new Garage();

//        Car car = new Car(11,4,5,380,false,"BMW","440i","Petrol","Blue",300,2, "Car");
//        Truck truck = new Truck(22,18,2,500,false,"Iveco","Truckster","Diesel", "Green", 2,20000,true, "Truck");
//        Motorbike motorbike = new Motorbike(33,2,1,150,false,"Yamaha", "R1", "Petrol","Green",false, "Motorbike");
//        Car c2 = new Car();
//        Car c3 = new Car();
//
//        car.openDoors();
//        truck.toggleTrailer();
//        motorbike.doWheelie();
//
//        garage.add(car);
//        garage.add(motorbike);
//        garage.add(truck);
//        garage.add(c2);
//        garage.add(c3);
//
//
//        garage.removeOne("Car");
//        garage.contentsGarage();
//
//        garage.removeType("Car");
//        garage.contentsGarage();
//
//        garage.bill();
//
//        garage.clearGarage();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(11,4,5,380,false,"BMW","440i","Petrol","Blue",300,2, "Car"));
        vehicles.add(new Car(22,4,2,380,false,"Toyota","Supra","Petrol","White",300,2, "Car"));
        vehicles.add(new Motorbike(33,2,1,150,false,"Yamaha", "R1", "Petrol","Green",false, "Motorbike"));

        System.out.println(vehicles);

        for (Vehicle v : vehicles) {
            v.startup();
        }

        Collections.sort(vehicles);

        System.out.println(vehicles);




    }
}
