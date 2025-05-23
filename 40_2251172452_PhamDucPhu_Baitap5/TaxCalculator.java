import java.util.List;

public class TaxCalculator {
    public double calculateTotalTax(List<TaxableItem> items) {
        double total = 0.0;
        if (items == null) {
            return total;
        }
        for (TaxableItem item : items) {
            total += item.calculateTax();
        }
        return total;
    }
}
