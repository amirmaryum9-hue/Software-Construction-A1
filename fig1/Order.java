package fig1;

import java.util.List;

public class Order {
    private TaxCalculator taxCalculator;
    private List<LineItem> lineItems;
    private String country;
    private String state;
    private String city;

    public Order(TaxCalculator taxCalculator, List<LineItem> lineItems,
                 String country, String state, String city) {
        this.taxCalculator = taxCalculator;
        this.lineItems = lineItems;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public double getOrderTotal() {
        double total = 0;
        for (LineItem item : lineItems) {
            double subtotal = item.getPrice() * item.getQuantity();
            double taxRate = taxCalculator.getTaxRate(country, state, item.getProduct());
            total += subtotal * (1 + taxRate);
        }
        return total;
    }
}