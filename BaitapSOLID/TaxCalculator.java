public class TaxCalculator {
    public double CalculateTotalTax(TaxableItem items[]){
        double sum = 0;
        for(int i=0; i < items.length; i++){
            sum = sum +  items[i].CalculateTax();
        }
        return sum;
    }
    
}
