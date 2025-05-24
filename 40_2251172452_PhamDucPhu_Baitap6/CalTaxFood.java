public class CalTaxFood implements ITaxCal {
    private Tax_Food taxFood;
    public CalTaxFood(Tax_Food taxFood) {
        this.taxFood = taxFood;
        
    }
    public double CaculateTax() {
        return taxFood.calculateTax();
    }
}