public class TaxBook implements TaxableItem {
    private double price;

    public TaxBook(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.25;
    }
}
