public class Tax_Electronics implements TaxableItem {
    private double price;

    public Tax_Electronics(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.2;
    }
}
