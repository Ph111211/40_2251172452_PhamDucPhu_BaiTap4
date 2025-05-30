public class TaxableAbstraction {
    private TaxableItem item;

    public TaxableAbstraction(TaxableItem item) {
        this.item = item;
    }

    public double calculateB() {
        return item.calculateTax();
    }
}
