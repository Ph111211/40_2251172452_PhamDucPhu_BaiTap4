public class TaxCalculator {
    public double calculateTotalTax(TaxableAbstraction[] items) {
        double total = 0.0;
        for (TaxableAbstraction item : items) {
            total += item.calculateB();
        }
        return total;
    }
    public static void main(String[] args) {
        TaxableAbstraction[] items = {
            new TaxableAbstraction(new Tax_Book(100)),
            new TaxableAbstraction(new Tax_Electronics(200)),
            new TaxableAbstraction(new Tax_Food(50))
        };

        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);

        System.out.println("Total Tax: " + totalTax);
    }
}
