public class Context {
    private TaxableItem t;

    public void setTaxItem(TaxableItem t) {
        this.t = t;
    }

    public double calculate() {
        if (t == null) {
            throw new IllegalStateException("Thue khong duoc null");
        }
        return t.calculateTax();
    }
}
