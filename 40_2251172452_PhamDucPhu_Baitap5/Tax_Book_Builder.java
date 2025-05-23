public class Tax_Book_Builder implements Builder {
    Tax_Book result;
    public void setPrice(double price) {
        result.setPrice(price);
    }
    public void setTax_Percent(double tax_Percent) {
        result.setTax_Percent(tax_Percent);
    }
    public Tax_Book getResult() {
        return result;
    }
    
    public void reset() {
        result = new Tax_Book(0, 0);
    }
}
