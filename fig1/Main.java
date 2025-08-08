package fig1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        LineItem item1 = new LineItem("electronics", 1000.0, 1);
        LineItem item2 = new LineItem("books", 50.0, 3);

        Order order = new Order(calculator, Arrays.asList(item1, item2),
                                "US", "California", "Los Angeles");
 
        System.out.println("Order Total: $" + order.getOrderTotal());
    }
}
