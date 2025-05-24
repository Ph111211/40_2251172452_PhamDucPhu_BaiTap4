public class Tax_Food implements TaxableItem {
    double price;
    double Tax_Percent;

    public Tax_Food(double price, double tax_Percent) {
        this.price = price;
        this.Tax_Percent = tax_Percent;
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