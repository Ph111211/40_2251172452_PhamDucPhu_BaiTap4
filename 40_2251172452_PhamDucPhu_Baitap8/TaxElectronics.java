public class TaxElectronics implements TaxableItem {
    private double price;

    public TaxElectronics(double price) {
        this.price = price;
    }

    @Override
    public double CalculateTax() {
        return price * 0.5; 
    }
    public double calculateTaxElectronics(){
        return this.CalculateTax();
    }
}
