import java.util.List;

public class TaxCalculator {
    public double calculateTotalTax(List<ITaxCal> items) {
        double total = 0.0;
        if (items == null) {
            return total;
        }
        for (ITaxCal item : items) {
            total += item.CaculateTax();
        }
        return total;
    }
}
