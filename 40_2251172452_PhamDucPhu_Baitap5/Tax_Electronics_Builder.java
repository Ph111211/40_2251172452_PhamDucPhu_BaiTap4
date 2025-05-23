public class Tax_Electronics_Builder implements Builder {
    public Tax_Electronics result;
    
    public void setPrice(double price) {
        result.setPrice(price);
    }
    public void setTax_Percent(double tax_Percent) {
        result.setTax_Percent(tax_Percent);
    }
    public Tax_Electronics getResult() {
        return result;
    }
    public void reset() {
        result = new Tax_Electronics(0, 0);
    }
}
