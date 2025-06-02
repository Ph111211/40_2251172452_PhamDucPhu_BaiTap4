public class Calculate {
    private TaxBook tb;
    private TaxFood tf;
    private TaxElectronics te;

    public double Calculator(TaxableItem t) {
        if (t instanceof TaxBook) {
            tb = (TaxBook) t;
            return calculateTaxBook();
        } else if (t instanceof TaxFood) {
            tf = (TaxFood) t;
            return calculateTaxFood();
        } else if (t instanceof TaxElectronics) {
            te = (TaxElectronics) t;
            return calculateTaxElectronics();
        } else {
            throw new IllegalArgumentException("Unknown tax item type");
        }
    }

    public double calculateTaxBook() {
        return tb.calculateTaxBook();
    }

    public double calculateTaxFood() {
        return tf.calculateTaxFood();
    }

    public double calculateTaxElectronics() {
        return te.calculateTaxElectronics();
    }
}
