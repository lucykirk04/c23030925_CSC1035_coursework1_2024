import java.util.Arrays;
import java.util.Scanner;

public class ReportingIO {
    public static void main(String[] args) {
        ReportingIO reporting = new ReportingIO();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Enter manufacturer data");
            System.out.println("2. Enter car model data");
            System.out.println("3. List all manufacturers");
            System.out.println("4. list all car models by given manufacturer");
            System.out.println("5. Provide reporting statistics");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

                if(choice == 1){
                    System.out.println(" Enter manufacturer name");
                    String name = scanner.nextLine();
                    reporting.addManufacturer(new Manufacturer(name));
            }
            else if (choice == 2){
                System.out.println(" Enter manufacturer name");
                String manufacturerName = scanner.nextLine();
                Manufacturer manufacturer = reporting.getManufacturers().stream()
                        .filter(m -> m.getname().equalsIgnoreCase(manufacturerName);
                        .findFirst().orElse(null);
                if(manufacturer != null){
                    System.out.println(" Enter model name:");
                    String carModel = scanner.nextLine();
                    System.out.println(" Enter model type(hatchback,saloon,estate):");
                    String type= scanner.nextLine();
                    System.out.println(" Enter weight:");
                    int weight = scanner.nextLine();
                    System.out.println(" Enter price:");
                    double price = scanner.nextLine();
                    System.out.println(" Enter number sold:");
                    int numberSold = scanner.nextInt();
                    manufacturer.addCarModel(new CarModel(carModel, type, weight, price, numberSold));
                }
                else{
                    System.out.println(" Manufacturer cannot be found");
                }
                }
            else if (choice == 6){
                System.out.println(" Exit program");
                break;
                }
        }
        scanner.close();
    }

    private Arrays getManufacturers() {
        return null;
    }

    private void addManufacturer(Manufacturer manufacturer) {

    }
}
