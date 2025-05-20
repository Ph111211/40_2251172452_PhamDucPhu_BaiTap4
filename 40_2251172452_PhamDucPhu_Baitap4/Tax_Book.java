public class Tax_Book implements TaxableItem {
    private double price;

    public Tax_Book(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.05; // Ví dụ: 5% thuế cho sách
    }
}