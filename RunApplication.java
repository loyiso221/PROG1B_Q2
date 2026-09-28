import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String consoleType;
        String store;
        int totalSales;

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                System.out.println("Invalid choice.");
                input.close();
                return;
        }

        input.nextLine();

        System.out.print("Enter store name: ");
        store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

        sales.printReport();

        input.close();
    }
}
