/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalvehiclesystem;

/**
 *
 * @author User
 */
public class Vehicles {

    protected String make;
    protected String model;
    protected double rentPrice;
    protected double vehicleNumber;

    public Vehicles(String make, String model, double rentPrice, double vehicleNumber) {
        this.make = make;
        this.model = model;
        this.rentPrice = rentPrice;
        this.vehicleNumber = vehicleNumber;
    }

    public void displayRentDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: " + "Php " + rentPrice);
    }

    public double CalculateRentFee(int days) {
        return rentPrice * days;
    }
}
//For Car

class Car extends Vehicles {

    private int numberOfDoors;

    public Car(String make, String model, double rentPrice, int numberOfDoors, double vehicleNumber) {
        super(make, model, rentPrice, vehicleNumber);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayRentDetails() {
        super.displayRentDetails();
        System.out.println("Number of Doors: " + numberOfDoors + "\nVehicle Number: " + "0");
    }
}

//For Truck
class Truck extends Vehicles {

    private int payloadCapacity;

    public Truck(String make, String model, double rentPrice, int payloadCapacity, double vehicleNumber) {
        super(make, model, rentPrice, vehicleNumber);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayRentDetails() {
        super.displayRentDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " Tons" + "\nVehicle Number: " + "1");
    }
}
//For Motorcycle 

class Motor extends Vehicles {

    private boolean hasHelmet;

    public Motor(String make, String model, double rentPrice, boolean hasHelmet, double vehicleNumber) {
        super(make, model, rentPrice, vehicleNumber);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void displayRentDetails() {
        super.displayRentDetails();
        System.out.println("Helmet Rental Availability: " + (hasHelmet ? "Yes" : "No"));
        System.out.println("Vehicle Number: " + "2");
    }
}
