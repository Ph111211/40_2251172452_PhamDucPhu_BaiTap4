public class Tax_Food implements TaxableItem {
    private double price;

    public Tax_Food(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.08; // 8% thuế cho thực phẩm
    }
}