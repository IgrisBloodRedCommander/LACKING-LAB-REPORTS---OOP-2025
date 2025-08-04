/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentalvehiclesystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RentalVehicleSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner VehicleRent = new Scanner(System.in);
        Vehicles[] vehicles1 = new Vehicles[3];

        vehicles1[0] = new Car("Toyota", "Camry", 2500.0, 4, 0);
        vehicles1[1] = new Truck("Ford", "F-150", 3000.0, 2, 1);
        vehicles1[2] = new Motor("Harley-Davidson", "Street 750", 1500.0, true, 2);

        int lastChoice;

        System.out.println("===========================\nSimple Vehicle Rental System\n===========================\n1. Enter Store\n2. Exit\n===========================");

      
        while (true) {
            try {
                lastChoice = VehicleRent.nextInt();
                if (lastChoice == 1 || lastChoice == 2) {
                    break;
                } else {
                    System.out.println("Please enter 1 to enter or 2 to exit.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                VehicleRent.next();
            }
        }

     
        while (lastChoice == 1) {
            int choices = -1;

            while (true) {
                System.out.println("Lex's Vehicle Rental System\n===========================\n1. Show Available Vehicles\n2. Exit\n===========================");
                try {
                    choices = VehicleRent.nextInt();
                    if (choices == 1 || choices == 2) {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number (1 or 2).");
                    VehicleRent.next();
                }
            }

            if (choices == 1) {
                System.out.println("===========================");
                for (Vehicles v : vehicles1) {
                    v.displayRentDetails();
                    System.out.println("===========================");
                }

                int number = -1;
                while (true) {
                    System.out.print("Input the Vehicle Number (0-2): ");
                    try {
                        number = VehicleRent.nextInt();
                        if (number >= 0 && number < vehicles1.length) {
                            break;
                        } else {
                            System.out.println("Invalid vehicle number. Please enter a number between 0 and 2.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        VehicleRent.next();
                    }
                }

                Vehicles selectedVehicle = vehicles1[number];
                System.out.println("You chose: " + selectedVehicle.make + " " + selectedVehicle.model);
                System.out.print("We have a special promo! Rent for more than 3 days and get a 15% discount.\nHow many days do you want to rent the vehicle? ");

                int days = -1;
                while (true) {
                    try {
                        days = VehicleRent.nextInt();
                        if (days > 0) {
                            break;
                        } else {
                            System.out.println("Please enter a positive number of days.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        VehicleRent.next();
                    }
                }

                double originalCost = selectedVehicle.CalculateRentFee(days);
                double discountedCost = originalCost - (originalCost * 0.15);

                System.out.println("===========================");
                selectedVehicle.displayRentDetails();
                if (days >= 3) {
                    System.out.println("You availed our 15% discount!");
                    System.out.println("Original Rental Cost for " + days + " days: Php " + originalCost);
                    System.out.println("Total Rental Cost with Discount: Php " + discountedCost);
                } else {
                    System.out.println("Total Rental Cost for " + days + " days: Php " + originalCost);
                }
                System.out.println("===========================");

            } else {
                System.out.println("Thank you, please come again!");
                break;
            }

            // Ask if user wants to rent again
            while (true) {
                System.out.println("Do you wish to rent another vehicle?\n1. Yes\n2. Exit");
                try {
                    lastChoice = VehicleRent.nextInt();
                    if (lastChoice == 1 || lastChoice == 2) {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    VehicleRent.next();
                }
            }
        }

        System.out.println("Program ended. Have a great day!");
        VehicleRent.close();
    }
}
