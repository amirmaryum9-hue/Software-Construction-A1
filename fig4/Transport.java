package fig4;

public class Transport {
    private Engine engine;
    private Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("Starting delivery to " + destination + " with cargo: " + cargo);
        driver.navigate();
        engine.move();
        System.out.println("Delivery completed.\n");
    }
}

