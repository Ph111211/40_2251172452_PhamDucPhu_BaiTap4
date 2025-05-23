public class Tax_Food_Builder implements Builder {
    Tax_Food result;
    public void setPrice(double price) {
        result.setPrice(price);
    }
    public void setTax_Percent(double tax_Percent) {
        result.setTax_Percent(tax_Percent);
    }
    public Tax_Food getResult() {
        return result;
    }
    public void reset() {
        result = new Tax_Food(0, 0);
    }
}
