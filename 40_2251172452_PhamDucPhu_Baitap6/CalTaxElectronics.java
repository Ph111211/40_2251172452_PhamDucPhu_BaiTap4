public class CalTaxElectronics implements ITaxCal {
    private Tax_Electronics taxElectronics;

    public CalTaxElectronics(Tax_Electronics taxElectronics) {
        this.taxElectronics = taxElectronics;
    }

    @Override
    public double CaculateTax() {
        return taxElectronics.calculateTax();
    }
    
}
