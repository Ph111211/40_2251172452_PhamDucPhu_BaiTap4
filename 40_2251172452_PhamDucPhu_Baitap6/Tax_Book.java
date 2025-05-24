public class Tax_Book implements TaxableItem {
    private double price;
    private double Tax_Percent;

    public Tax_Book(double price, double tax_Percent) {
        this.Tax_Percent = tax_Percent;
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * Tax_Percent; 
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTax_Percent(double tax_Percent) {
        this.Tax_Percent = tax_Percent;
    }
}