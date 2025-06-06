public class TaxFood implements TaxableItem {
    private double price;

    public TaxFood(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.1;
    }
}
