public class TaxBook implements TaxableItem {
    private double price;

    public TaxBook(double price) {
        this.price = price;
    }

    @Override
    public double CalculateTax() {
        return price * 0.2;
    }
    public double calculateTaxBook(){
        return this.CalculateTax();
    }
}
