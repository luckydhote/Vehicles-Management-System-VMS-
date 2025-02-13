import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();

        while (true)
        {
            System.out.println("Vehicle Management System");
            System.out.println("1. Add Vehicle ");
            System.out.println("2. View Vehicle ");
            System.out.println("3. Exit ");
            System.out.println("Enter your Choice:  ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
                {
                case 1:
                    System.out.println("Enter Make: ");
                    String make = scanner.nextLine();
                    System.out.println("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.println("Enter Year: ");
                    int year = scanner.nextInt();
                    System.out.println("Enter Price: ");
                    double price = scanner.nextDouble();

                    Vehicle newVehicle = new Vehicle( make, model, year, price);
                    vehicleManager.addVehicle(newVehicle);
                    System.out.println("Vehicle added successfully! ");
                    break;

                case 2 :
                    System.out.println(" All Vehicles: ");
                    for (Vehicle vehicle : vehicleManager.getAllVehicles())
                    {
                        System.out.println(vehicle);
                    }
                    break;

                case 3:
                    System.out.println("Exiting.........");
                    System.exit(0);

                default:
                    System.out.println(" ERROR.....\nInvalid choice. Please Try Again! Thank You");


                }


        }
    }

}