public class TaxFood implements TaxableItem {
    private double price;

    public TaxFood(double price) {
        this.price = price;
    }

    @Override
    public double CalculateTax() {
        return price * 0.1; // Thuế thực phẩm 10%
    }
    public double calculateTaxFood(){
        return this.CalculateTax();
    }
}
