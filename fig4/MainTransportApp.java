package fig4;

public class MainTransportApp {
    public static void main(String[] args) {
        // Transport 1: Electric Engine + Robot Driver
        Engine electric = new ElectricEngine();
        Driver robot = new Robot();
        Transport robotVan = new Transport(electric, robot);
        robotVan.deliver("Warehouse B", "Electronics");

        // Transport 2: Combustion Engine + Human Driver
        Engine combustion = new CombustionEngine();
        Driver human = new Human();
        Transport truck = new Transport(combustion, human);
        truck.deliver("Store A", "Groceries");
    }
}