public class CalTaxBook implements ITaxCal {
    private Tax_Book taxBook;

    public CalTaxBook(Tax_Book taxBook) {
        this.taxBook = taxBook;
    }

    @Override
    public double CaculateTax() {
        return taxBook.calculateTax();
    }
    
}
