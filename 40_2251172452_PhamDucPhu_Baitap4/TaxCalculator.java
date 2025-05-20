import java.util.List;

public class TaxCalculator {
    public double calculateTotalTax(List<TaxableItem> items) {
        double total = 0.0;
        for (TaxableItem item : items) {
            total += item.calculateTax();
        }
        return total;
    }
}
