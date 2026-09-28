public class ConsoleSales extends Console {

    public ConsoleSales(
            String consoleType,
            String store,
            int totalSales) {

        super(consoleType, store, totalSales);
    }

    public void printReport() {

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("       CONSOLE SALES REPORT");
        System.out.println("--------------------------------");

        System.out.println(
                "CONSOLE TYPE: " + getConsoleType()
        );

        System.out.println(
                "STORE NAME: " + getStore()
        );

        System.out.println(
                "TOTAL SALES: " + getTotalSales()
        );

        System.out.println("--------------------------------");
    }
}
