package fig1;

public class TaxCalculator {

    public double getTaxRate(String country, String state, String product) {
        // Delegating based on country
        if ("US".equalsIgnoreCase(country)) {
            return getUSTax(state);
        } else if ("EU".equalsIgnoreCase(country)) {
            return getEUTax(country);
        } else if ("China".equalsIgnoreCase(country)) {
            return getChineseTax(product);
        } else {
            return 0.05; // default tax rate
        }
    }

    private double getUSTax(String state) {
        // Placeholder logic
        return switch (state.toLowerCase()) {
            case "california" -> 0.08;
            case "texas" -> 0.07;
            default -> 0.06;
        };
    }

    private double getEUTax(String country) {
        // Placeholder EU tax
        return 0.20;
    }

    private double getChineseTax(String product) {
        // Simulate product-based tax
        if (product.equalsIgnoreCase("electronics")) {
            return 0.15;
        } else {
            return 0.10;
        }
    }
}
